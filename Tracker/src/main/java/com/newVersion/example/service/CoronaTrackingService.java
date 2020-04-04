
package com.newVersion.example.service;

import java.io.IOException;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.newVersion.example.entities.CoronaVirusData;

@Service
public class CoronaTrackingService {
	String url = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
	private List<CoronaVirusData> myDatas = new ArrayList<>();

	public List<CoronaVirusData> getMyDatas() {
		return myDatas;
	}

	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void fetchVirusData() throws IOException
	{
		List<CoronaVirusData> allDatas = new ArrayList<>();

		HttpClient httpClient = HttpClients.createDefault();

		/*
		 * DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM-dd-yyy");
		 * LocalDateTime now = LocalDateTime.now().minusDays(1); url += dft.format(now)
		 * + ".csv"; System.out.println(url);
		 */
		
		HttpGet request = new HttpGet(url);
		String file=null;
		HttpResponse response=null;
		response = httpClient.execute(request);
		System.out.println("status code is :"+response.getStatusLine().getStatusCode());
		HttpEntity entity = response.getEntity();
		file = EntityUtils.toString(entity);

		StringReader csvreader = new StringReader(file);

		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvreader);
		for (CSVRecord record : records)
		{
			CoronaVirusData cvdata = new CoronaVirusData();
			
			cvdata.setCountry(record.get("Country/Region"));
			cvdata.setTotal_Confirmed_Cases(Integer.parseInt(record.get(record.size()-1)));
		    allDatas.add(cvdata);
		}
		myDatas = allDatas;
	}
	
	
	public Map<String,CoronaVirusData> something() throws ClientProtocolException, IOException
	{
		
		HttpClient httpClient = HttpClients.createDefault();
		HttpGet request = new HttpGet(url);
		String file=null;
		HttpResponse response=null;
		response = httpClient.execute(request);
		System.out.println("status code is :"+response.getStatusLine().getStatusCode());
		HttpEntity entity = response.getEntity();
		file = EntityUtils.toString(entity);
		
		StringReader csvreader = new StringReader(file);
        
		Map<String,List<Integer>> contr_records = new HashMap<String, List<Integer>>();
		
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvreader);
		for (CSVRecord record : records)
		{
		
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  for(int i=1;i<=7;i++)
		   {
		     int tot_confirm = Integer.parseInt(record.get(record.size()-i));
		     list.add(tot_confirm);
		   }
		
		
		
		}
		
		Map<String,CoronaVirusData> countries = new HashMap<String, CoronaVirusData>();
		Iterator<CoronaVirusData> itr = myDatas.iterator();
		while(itr.hasNext())
		{
			CoronaVirusData cv = itr.next();
			if(countries.containsKey(cv.getCountry()))
			{
				CoronaVirusData temp = countries.get(cv.getCountry());
				temp.setTotal_Confirmed_Cases(temp.getTotal_Confirmed_Cases()+
						cv.getTotal_Confirmed_Cases());
				countries.put(cv.getCountry(),temp);
			}
			else
			{
				countries.put(cv.getCountry(),cv);
			}
		}
		
		//System.out.println(countries);
		return countries;
		
	}
}
