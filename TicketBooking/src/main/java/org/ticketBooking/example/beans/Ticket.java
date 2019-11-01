package org.ticketBooking.example.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket
{
   @Id
   private int ticket_Id;
   private String ticket_Name;
   private Date ticket_Creation_Date;
   private String resolver_Name;
   
   public Ticket() {
	// TODO Auto-generated constructor stub
     }

public Ticket(int ticket_Id, String ticket_Name, String resolver_Name) {
	super();
	this.ticket_Id = ticket_Id;
	this.ticket_Name = ticket_Name;
	this.resolver_Name = resolver_Name;
	this.ticket_Creation_Date=new Date();
}

public int getTicket_Id() {
	return ticket_Id;
}

public void setTicket_Id(int ticket_Id) {
	this.ticket_Id = ticket_Id;
}

public String getTicket_Name() {
	return ticket_Name;
}

public void setTicket_Name(String ticket_Name) {
	this.ticket_Name = ticket_Name;
}

public Date getTicket_Creation_Date() {
	return ticket_Creation_Date;
}

public void setTicket_Creation_Date(Date ticket_Creation_Date) {
	this.ticket_Creation_Date = ticket_Creation_Date;
}

public String getResolver_Name() {
	return resolver_Name;
}

public void setResolver_Name(String resolver_Name) {
	this.resolver_Name = resolver_Name;
}

   
}
