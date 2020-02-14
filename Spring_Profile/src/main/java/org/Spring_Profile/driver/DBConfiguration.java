package org.Spring_Profile.driver;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration
{
   private String driverClssName;
   private String url;
   private String username;
   private String password;
   
   @Profile("dev")
   @Bean
   public String devDatabaseConnection()
   {
	   System.out.println("db connection for dev : ");
	   System.out.println(driverClssName);
	   System.out.println(url);
	   System.out.println(username);
	   System.out.println(password);
	   return "DB connection for developement";
   }
   @Profile("test")
   @Bean
   public String testDatabaseConnection()
   {
	   System.out.println("db connection for Testing : ");
	   System.out.println(driverClssName);
	   System.out.println(url);
	   System.out.println(username);
	   System.out.println(password);
	   return "DB connection for developement";
   }
   @Profile("prod")
   @Bean
   public String prodDatabaseConnection()
   {
	   System.out.println("db connection for Production : ");
	   System.out.println(driverClssName);
	   System.out.println(url);
	   System.out.println(username);
	   System.out.println(password);
	   return "DB connection for Production";
   }
}
