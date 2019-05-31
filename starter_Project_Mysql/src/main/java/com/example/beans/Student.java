package com.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
   @Id
   private int rln;
   private String fname;
   private String lname;
   private String mail;
   private String address;
   public Student() {
	// TODO Auto-generated constructor stub
   }
public Student(int rln, String fname,String lname,String mail, String address) {
	super();
	this.rln = rln;
	this.fname = fname;
	this.lname = lname;
	this.mail=mail;
	this.address = address;
}
public int getRln() {
	return rln;
}
public void setRln(int rln) {
	this.rln = rln;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getLname() {
	return lname;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
   public void setMail(String mail) {
	this.mail = mail;
}
   public String getMail() {
	return mail;
}
}
