
package com.newVersion.example.service;

import java.io.IOException;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
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

import com.newVersion.example.entities.CoronaVirusData;

@Service
public class CoronaTrackingService {
	String url = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_daily_reports/";

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

		DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM-dd-yyy");
		LocalDateTime now = LocalDateTime.now().minusDays(1);
		url += dft.format(now) + ".csv";

		HttpGet request = new HttpGet(url);
		String file=null;
		HttpResponse response=null;
		try
		{
		response = httpClient.execute(request);
		System.out.println("status code is :"+response.getStatusLine().getStatusCode());
		HttpEntity entity = response.getEntity();
		file = EntityUtils.toString(entity);
		}
		catch(Exception e)
		{
			System.out.println("status code is :"+response.getStatusLine().getStatusCode());
			System.out.println("can not execute");
		}

		StringReader csvreader = new StringReader(file);

		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvreader);
		for (CSVRecord record : records) {
			CoronaVirusData cv_Data = new CoronaVirusData(record.get("Country/Region"),
					Integer.parseInt(record.get(record.size() - 5)), Integer.parseInt(record.get(record.size() - 4)),
					Integer.parseInt(record.get(record.size() - 3)));

			allDatas.add(cv_Data);
		}

		myDatas = allDatas;

	}
}
