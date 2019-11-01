package com.Resturant_API.example.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Customer
{
   @Id
   private int customerId;
   private String customerName;
   private String customerAddress;
   private Date orderplacedDate;
   private Date orderRecvedDate;
   public Customer() {
	// TODO Auto-generated constructor stub
    }
public Customer(int customerId, String customerName, String customerAddress) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.orderplacedDate=new Date();
	this.orderRecvedDate=new Date();
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
@JsonSerialize(using=JsonDateSerializer.class)
public Date getOrderplacedDate() {
	return orderplacedDate;
}
@JsonDeserialize(using=JsonDateDeserializer.class)
public void setOrderplacedDate(Date orderplacedDate) {
	this.orderplacedDate = orderplacedDate;
}
@JsonSerialize(using=JsonDateSerializer.class)
public Date getOrderRecvedDate() {
	return orderRecvedDate;
}
@JsonDeserialize(using=JsonDateDeserializer.class)
public void setOrderRecvedDate(Date orderRecvedDate) {
	this.orderRecvedDate = orderRecvedDate;
}
   
   
}
