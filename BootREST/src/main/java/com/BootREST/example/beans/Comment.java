package com.BootREST.example.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Comment {
    
	@Id
	private int cid;
	private String comment;
	private String prof_Name;
	private Date commrnt_Date;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(int cid, String comment, String prof_Name) {
		super();
		this.cid = cid;
		this.comment = comment;
		this.prof_Name = prof_Name;
		this.commrnt_Date = new Date();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setCommrnt_Date(Date commrnt_Date) {
		this.commrnt_Date = commrnt_Date;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCommrnt_Date() {
		return commrnt_Date;
	}
	public String getProf_Name() {
		return prof_Name;
	}
	public void setProf_Name(String prof_Name) {
		this.prof_Name = prof_Name;
	}
	
}
