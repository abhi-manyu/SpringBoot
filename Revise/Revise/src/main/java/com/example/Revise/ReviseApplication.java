package com.example.Revise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//or
@SpringBootApplication
// though we are not using databas efor now, and spring boot tries to auto configure
// data source available in it's class path, so it will through error
// so for disabling this auto configuration we need to write following
//@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
public class ReviseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviseApplication.class, args);
	}

}
