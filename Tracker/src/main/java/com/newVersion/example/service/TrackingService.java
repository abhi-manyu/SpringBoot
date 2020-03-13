package com.newVersion.example.service;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.newVersion.example.entities.VirusData;

@Service
public class TrackingService
{
    private String virus_Data = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_19-covid-Confirmed.csv";
    
    private List<VirusData> myDatas = new ArrayList<>();
    public List<VirusData> getMyDatas() {
		return myDatas;
	}
    
    @PostConstruct
    @Scheduled(cron="* * 1 * * *")
    public void fetchVirusData() throws IOException
    {
    	List<VirusData> allDatas = new ArrayList<>();
    	
    	
    	
    	HttpClient httpClient = HttpClients.createDefault();
    	HttpGet request = new HttpGet(virus_Data);
    	HttpResponse  response = httpClient.execute(request);
    	HttpEntity entity = response.getEntity();
    	//System.out.println(EntityUtils.toString(entity));
    	
    	StringReader csvreader = new StringReader(EntityUtils.toString(entity));
    	
    	Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvreader);
    	for (CSVRecord record : records)
    	{
    		VirusData data = new VirusData(record.get("Country/Region"),record.get("Province/State"),Integer.parseInt(record.get(record.size()-1)));
    	    allDatas.add(data);
    	}
    	
    	myDatas = allDatas;
    	
    }
}
