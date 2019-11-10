package com.Resturant_API.example.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Resturant
{
	@Id
   private int id;
   private String resturant_Name;
   private String resturant_Woner;
   private String resturant_Address;
   private Date estd_Date;
   private double rating;
   
   public Resturant() {
	// TODO Auto-generated constructor stub
    }

public Resturant(int id, String resturant_Name, String resturant_Address, 
		String resturant_Woner, double rating) {
	super();
	this.id = id;
	this.resturant_Name = resturant_Name;
	this.resturant_Woner=resturant_Woner;
	this.resturant_Address=resturant_Address;
	this.estd_Date=new Date();
	this.rating=rating;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getResturant_Name() {
	return resturant_Name;
}

public void setResturant_Name(String resturant_Name) {
	this.resturant_Name = resturant_Name;
}

   public void setResturant_Address(String resturant_Address) {
	this.resturant_Address = resturant_Address;
}
   public String getResturant_Address() {
	return resturant_Address;
}
   public void setResturant_Woner(String resturant_Woner) {
	this.resturant_Woner = resturant_Woner;
}
   public String getResturant_Woner() {
	return resturant_Woner;
}
   @JsonDeserialize(using=JsonDateDeserializer.class)
   public void setEstd_Date(Date estd_Date) {
	this.estd_Date = estd_Date;
}
   @JsonSerialize(using=JsonDateSerializer.class)
   public Date getEstd_Date() {
	return estd_Date;
}
   public void setRating(double rating) {
	this.rating = rating;
}
   public double getRating() {
	return rating;
}
}
