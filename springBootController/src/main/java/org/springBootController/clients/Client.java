package org.springBootController.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.springBootController.controllers")
public class Client {

	public static void main(String[] args) {
       
		SpringApplication.run(Client.class, args);
	}

}
