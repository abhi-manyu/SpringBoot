package com.example.Demo_Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoBeansApplication extends SpringBootServletInitializer implements
                                                                         CommandLineRunner
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return  builder.sources(DemoBeansApplication.class);
	}
	
	 @Autowired
	 private ApplicationContext appContext;
	
	public static void main(String[] args)
	{
		SpringApplication.run(DemoBeansApplication.class, args);
	}
   

  @Override
   public void run(String... args) throws Exception
  {
	 String[] beans=appContext.getBeanDefinitionNames();
	 for(String bean:beans)
	 {
		 System.out.println(bean+"------>>>>>>>"+appContext.getBean(bean).getClass());
	 }
	
   }
}
