package com.messenger_API.example.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@XmlRootElement
public class Profile
{
	@Id
   private int prof_Id;
   private String first_name;
   private String last_Name;
   private String username;
   private String password;
   private Date date_Of_Birth;
   private int age;
   private String address;
   private String mail;
   
   @ElementCollection
   private List<Message> messages=new ArrayList<>();
   
   public Profile() {
	// TODO Auto-generated constructor stub
   }

public Profile(int prof_Id, String first_name, String last_Name, String username, String password, int age,
		String address, String mail) {
	super();
	this.prof_Id = prof_Id;
	this.first_name = first_name;
	this.last_Name = last_Name;
	this.username = username;
	this.password = password;
	this.age = age;
	this.address = address;
	this.mail = mail;
	this.date_Of_Birth=new Date();
}

public int getProf_Id() {
	return prof_Id;
}

public void setProf_Id(int prof_Id) {
	this.prof_Id = prof_Id;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_Name() {
	return last_Name;
}

public void setLast_Name(String last_Name) {
	this.last_Name = last_Name;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@JsonSerialize(using=JsonDateSerializer.class)
public Date getDate_Of_Birth() {
	return date_Of_Birth;
}

@JsonDeserialize(using=JsonDateDeserializer.class)
public void setDate_Of_Birth(Date date_Of_Birth) {
	this.date_Of_Birth = date_Of_Birth;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}
   
   public void setMessages(List<Message> messages) {
	this.messages = messages;
}
  public List<Message> getMessages() {
	return messages;
}
  
}
