package com.practice.example.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {

	@Id
	private int commentId;
	private String profileName;
	private String comment;
	private Date commentedDate;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(int commentId, String profileName, String comment, Date commentedDate) {
		super();
		this.commentId = commentId;
		this.profileName = profileName;
		this.comment = comment;
		this.commentedDate = commentedDate;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentedDate() {
		return commentedDate;
	}

	public void setCommentedDate(Date commentedDate) {
		this.commentedDate = commentedDate;
	}
	
	
}
