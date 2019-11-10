package com.messenger_API.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude=SecurityAutoConfiguration.class)
public class MessengerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessengerApiApplication.class, args);
	}

}
