package com.practice.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.example.beans.Comment;
import com.practice.example.beans.Post;
import com.practice.example.repository.PostRepository;
import com.practice.example.service.PostService;

@RestController
public class PostController
{
   
	@Autowired
	private PostService postservice;

	@GetMapping
	public Iterable<Post> getAllPosts()
	{
		return postservice.getAllPosts();
	}
	
	@GetMapping(value="/{id}")
	public Post getSinglePost(@PathVariable int id)
	{
		return postservice.getSinglePost(id);
	}
	
	@PostMapping
	public Iterable<Post> addPost(@RequestBody Post post)
	{
		return postservice.addPost(post);
	}
	
	@DeleteMapping(value="/{postID}")
	public Iterable<Post> deletePost(@PathVariable int postID) {
		return postservice.deletePost(postID);
	}
	
	@GetMapping(value="/{postID}/comments")
	public List<Comment> getAllComments(@PathVariable int postID)
	{
		return postservice.getAllComments(postID);
	}
	
	@PostMapping(value = "/{postID}/comments")
	public List<Comment> addComment(@PathVariable int postID, @RequestBody Comment comment) {
		return postservice.addComment(postID, comment);
	}
	
	@GetMapping(value="/{postId}/comments/{commentId}")
	public Comment getComment(@PathVariable int postId,@PathVariable int commentId)
	{
		return postservice.getComment(postId, commentId);
	}
	
	@DeleteMapping(value="{postId}/comments/{commentId}")
	public List<Comment> deleteComment(@PathVariable int postId,
			               @PathVariable int commentId)
	{
		return postservice.deleteComments(postId, commentId);
	}
}
