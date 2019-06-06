package com.spring_security.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Product
{
   @Id
   private int prod_Id;
   private String prod_Name;
   private double product_Price;
   private String buyer_Name;
   private Date order_Placed_date;
   private Date delivered_Date;
   private String vendor_Name;
   private String delivery_Location;
   private String payment_Status;
   
   public Product() {
	// TODO Auto-generated constructor stub
   }

public Product(int prod_Id, String prod_Name, double product_Price, String buyer_Name, String vendor_Name,
		String delivery_Location, String payment_Status) {
	super();
	this.prod_Id = prod_Id;
	this.prod_Name = prod_Name;
	this.product_Price = product_Price;
	this.buyer_Name = buyer_Name;
	this.vendor_Name = vendor_Name;
	this.delivery_Location = delivery_Location;
	this.payment_Status = payment_Status;
	this.order_Placed_date=new Date();
	this.delivered_Date=new Date();
   }
   public int getProd_Id() {
	return prod_Id;
}
   public void setProd_Id(int prod_Id) {
	this.prod_Id = prod_Id;
}
   public String getProd_Name() {
	return prod_Name;
}
   public void setProd_Name(String prod_Name) {
	this.prod_Name = prod_Name;
}
   public double getProduct_Price() {
	return product_Price;
}
   public void setProduct_Price(double product_Price) {
	this.product_Price = product_Price;
}

public String getBuyer_Name() {
	return buyer_Name;
}

public void setBuyer_Name(String buyer_Name) {
	this.buyer_Name = buyer_Name;
}

@JsonSerialize(using=JsonDateSerializer.class)
public Date getOrder_Placed_date() {
	return order_Placed_date;
}

public void setOrder_Placed_date(Date order_Placed_date) {
	this.order_Placed_date = order_Placed_date;
}

@JsonSerialize(using=JsonDateSerializer.class)
public Date getDelivered_Date() {
	return delivered_Date;
}

public void setDelivered_Date(Date delivered_Date) {
	this.delivered_Date = delivered_Date;
}

public String getVendor_Name() {
	return vendor_Name;
}

public void setVendor_Name(String vendor_Name) {
	this.vendor_Name = vendor_Name;
}

public String getDelivery_Location() {
	return delivery_Location;
}

public void setDelivery_Location(String delivery_Location) {
	this.delivery_Location = delivery_Location;
}

public String getPayment_Status() {
	return payment_Status;
}

public void setPayment_Status(String payment_Status) {
	this.payment_Status = payment_Status;
}
   
   
}
