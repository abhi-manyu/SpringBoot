package org.springboot.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket
{
   @Id
   private int ticket_Id;
   private int noOfPassengers;
   private String source_Name;
   private String destination_Name;
   private Date booked_Date;
   public Ticket() {
	// TODO Auto-generated constructor stub
    }
public Ticket(int ticket_Id, int noOfPassengers, String source_Name, String destination_Name) {
	super();
	this.ticket_Id = ticket_Id;
	this.noOfPassengers = noOfPassengers;
	this.source_Name = source_Name;
	this.destination_Name = destination_Name;
	this.booked_Date=new Date();
}
public int getTicket_Id() {
	return ticket_Id;
}
public void setTicket_Id(int ticket_Id) {
	this.ticket_Id = ticket_Id;
}
public int getNoOfPassengers() {
	return noOfPassengers;
}
public void setNoOfPassengers(int noOfPassengers) {
	this.noOfPassengers = noOfPassengers;
}
public String getSource_Name() {
	return source_Name;
}
public void setSource_Name(String source_Name) {
	this.source_Name = source_Name;
}
public String getDestination_Name() {
	return destination_Name;
}
public void setDestination_Name(String destination_Name) {
	this.destination_Name = destination_Name;
}
public Date getBooked_Date() {
	return booked_Date;
}
public void setBooked_Date(Date booked_Date) {
	this.booked_Date = booked_Date;
}
   
}
