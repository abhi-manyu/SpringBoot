package com.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Student
{
   @Id
   private int rln;
   private String name;
   private String mail;
   private String address;
   public Student() {
	// TODO Auto-generated constructor stub
   }
public Student(int rln, String name,String mail, String address) {
	super();
	this.rln = rln;
	this.name = name;
	this.mail=mail;
	this.address = address;
}
public int getRln() {
	return rln;
}
public void setRln(int rln) {
	this.rln = rln;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
