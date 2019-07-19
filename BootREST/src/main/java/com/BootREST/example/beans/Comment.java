package com.BootREST.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
    
	@Id
	private int cid;
	private String comment;
	private String prof_Name;
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(int cid, String comment, String prof_Name) {
		super();
		this.cid = cid;
		this.comment = comment;
		this.prof_Name = prof_Name;
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
	public String getProf_Name() {
		return prof_Name;
	}
	public void setProf_Name(String prof_Name) {
		this.prof_Name = prof_Name;
	}
	
}
