package com.employeeManagement.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@SpringBootApplication
@SpringBootConfiguration
public class Driver
{
	public static void main(String[] args) {
		SpringApplication.run(Driver.class, args);

	}
	
	@Bean
	public Hibernate5Module hibernate5Module() {
	    Hibernate5Module hnetModule = new Hibernate5Module();
	    hnetModule.disable(Hibernate5Module.Feature.USE_TRANSIENT_ANNOTATION);
	    return hnetModule;
	}
	
	
}
