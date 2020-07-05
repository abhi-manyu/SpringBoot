package com.newVersion.example.service;

import java.io.IOException;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class WrapupCountries {
	String url = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_daily_reports/";

	private Map<String, CoronaVirusData> myDatas = new HashMap<String, CoronaVirusData>();

	public Map<String, CoronaVirusData> getMyDatas() {
		return myDatas;
	}

	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void fetchVirusData() throws IOException {
		List<CoronaVirusData> allDatas = new ArrayList<>();

		HttpClient httpClient = HttpClients.createDefault();

		DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM-dd-yyy");
		LocalDateTime now = LocalDateTime.now().minusDays(1);
		url += dft.format(now) + ".csv";
		
		System.out.println(url);

		HttpGet request = new HttpGet(url);
		
		HttpResponse response = httpClient.execute(request);
		HttpEntity entity = response.getEntity();
		

		StringReader csvreader = new StringReader(EntityUtils.toString(entity));

		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvreader);
		for (CSVRecord record : records)
		{
			CoronaVirusData cv_Data = new CoronaVirusData(record.get("Country_Region"),
					Integer.parseInt(record.get(record.size() - 7)), Integer.parseInt(record.get(record.size() - 6)),
					Integer.parseInt(record.get(record.size() - 5)));

			allDatas.add(cv_Data);
		}
        

		for (CoronaVirusData data : allDatas) {
			if (myDatas.containsKey(data.getCountry())) {
				CoronaVirusData temp = myDatas.get(data.getCountry());
				temp.setTotal_Confirmed_Cases(temp.getTotal_Confirmed_Cases() + data.getTotal_Confirmed_Cases());
				temp.setTotal_Deaths(temp.getTotal_Deaths() + data.getTotal_Deaths());
				temp.setTotal_Recovered(temp.getTotal_Recovered() + data.getTotal_Recovered());
				myDatas.put(data.getCountry(), temp);

			}
			else
				myDatas.put(data.getCountry(), data);
		}

	}
}
