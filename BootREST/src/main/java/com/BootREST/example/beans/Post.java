package com.BootREST.example.beans;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Post
{
	@Id
   private int id;
   private String post;
   private String poster_Name;
   
   @javax.persistence.Transient
   private Date posted_Date;
   
   @OneToMany(cascade=CascadeType.ALL)
   private List<Comment> comments=new ArrayList<>();
   
   
   public Post() {
	// TODO Auto-generated constructor stub
    }
public Post(int id, String post,String poster_NAme) {
	super();
	this.id = id;
	this.post = post;
	this.poster_Name=poster_NAme;
	this.posted_Date=new Date();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
   public void setPoster_Name(String poster_Name) {
	this.poster_Name = poster_Name;
}
   @JsonDeserialize(using=JsonDateDeserializer.class)
   public void setPosted_Date(Date posted_Date) {
	this.posted_Date = posted_Date;
}
   @JsonSerialize(using=JsonDateSerializer.class)
   public Date getPosted_Date() {
	return posted_Date;
}
   public String getPoster_Name() {
	return poster_Name;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
@Transient(false)
public List<Comment> getComments() {
	return comments;
}
   
}
