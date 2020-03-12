package com.example.Demo_Beans;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class DemoBeansApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(DemoBeansApplication.class, args);
		diplayTime();
	}
	
	@Scheduled(initialDelay=1000, fixedRate=10000)
	public static void diplayTime()
	{
		System.out.println("time is : "+ Calendar.getInstance().getTime());
	}
	
	
	
	
	
	
}
