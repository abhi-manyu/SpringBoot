package com.spring_security.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

// here we are using properties file for specifying user name and pwd.
// so for restrict Spring boot to generate its own default password used 
// following configuration with @SpringBootApplication

@SpringBootApplication//(exclude= {SecurityAutoConfiguration.class})
   // we can disable spring boot securityAutoConfiguration to b applied by the above way 
   // or else in application.properties also we can write and disable that.
   
public class SecurityDemoApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SecurityDemoApplication.class, args);
	}

}
