package com.example;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.beans.Student;
import com.example.service.StudentService;

@SpringBootApplication
public class StarterApplication implements CommandLineRunner
{
   @Autowired
   private DataSource datasource;
	public static void main(String[] args)
	{
		//SpringApplication.run(StarterApplication.class, args);
		ConfigurableApplicationContext ap=
				SpringApplication.run(StarterApplication.class, args);
		StudentService ssrv=ap.getBean(StudentService.class);
		
		Student s1=new Student(111,"Scarelett Blue","abhi@gmail.com","Old SeePort");
		ssrv.addStudent(s1);
		
	}
	@Override
	public void run(String... args) throws Exception
	{
		System.out.println(datasource);
	}

}
