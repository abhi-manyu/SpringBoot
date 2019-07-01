package com.messenger_API.example.beans;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement
@Entity
@Embeddable
public class Message
{
	@Id
   private int msg_Id;
   private String msg;
   private String sender_Name;
   private String recvr_Name;
   private Date send_Date; 
   
   public Message()
   {
	
   }

public Message(int msg_Id, String msg, String sender_Name,String recvr_Name) {
	super();
	this.msg_Id = msg_Id;
	this.msg = msg;
	this.sender_Name = sender_Name;
	this.recvr_Name=recvr_Name;
	this.send_Date=new Date();
}

public int getMsg_Id() {
	return msg_Id;
}

public void setMsg_Id(int msg_Id) {
	this.msg_Id = msg_Id;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public String getSender_Name() {
	return sender_Name;
}

public void setSender_Name(String sender_Name) {
	this.sender_Name = sender_Name;
}

@JsonSerialize(using=JsonDateSerializer.class)
public Date getSend_Date() {
	return send_Date;
}

@JsonDeserialize(using=JsonDateDeserializer.class)
public void setSend_Date(Date send_Date) {
	this.send_Date = send_Date;
}
   
   public void setRecvr_Name(String recvr_Name) {
	this.recvr_Name = recvr_Name;
}
   public String getRecvr_Name() {
	return recvr_Name;
}
}
