package com.practice.example.beans;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post
{

	@Id
	private int postId;
	private String posterName;
	private String post;
	private Date postingDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Comment> comments;
	

	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(int postId, String posterName, String post, Date postingDate) {
		super();
		this.postId = postId;
		this.posterName = posterName;
		this.post = post;
		this.postingDate = postingDate;
	}

	
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPosterName() {
		return posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	
	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}
	
	
}
