package com.subresource.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Comment
{
   @Id
   private int cId;
   private String comment;
   public Comment() {
	// TODO Auto-generated constructor stub
   }
public Comment(int cId, String comment) {
	super();
	this.cId = cId;
	this.comment = comment;
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
   
}
