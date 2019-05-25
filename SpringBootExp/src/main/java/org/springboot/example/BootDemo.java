package org.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemo
{
   //creating ticket by manualy and inserting into database by calling the service
   // method of Service layer
	
	/*public static void main(String[] args)
	{
		ConfigurableApplicationContext ap=
				          SpringApplication.run(BootDemo.class, args);
		TicketBookingService tbc=
				    //ap.getBean("ticketBookingService",TicketBookingService.class);
				ap.getBean(TicketBookingService.class);
		
		Ticket t1=new Ticket(111,5,"Bhadrak","Howrah");
		tbc.createTicket(t1);

	}*/
	
	
	//creating ticket by Controller's post method
	public static void main(String[] args)
	{
		SpringApplication.run(BootDemo.class, args);
	}

}
