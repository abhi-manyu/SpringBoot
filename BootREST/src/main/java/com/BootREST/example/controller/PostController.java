package com.BootREST.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BootREST.example.beans.Comment;
import com.BootREST.example.beans.Post;
import com.BootREST.example.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostController {

	@Autowired
	private PostService poser;
	
	
	@GetMapping
	public Iterable<Post> getAllPosts()
	{
	    return poser.getAllPosts();
	}
	
	@GetMapping(value="/{id}")
	public Post getAllPosts(@PathVariable int id)
	{
	    return poser.get_a_Post(id);
	}
	
	@PostMapping
	public Iterable<Post> addPost(@RequestBody Post post)
	{
		System.out.println("posted date is : "+post.getPosted_Date());
		return poser.addPost(post);
	}
	
	@PutMapping(value="/{id}")
	public Post updatePost(@PathVariable int id, @RequestBody Post post)
	{
	   return poser.updatePost(id, post);
	}
	
	@DeleteMapping(value="/{id}")
	public Iterable<Post> deletePost(@PathVariable int id)
	{
		return poser.deletePost(id);
	}
	
	@GetMapping(value="/{id}/comments")
	public Iterable<Comment> getAllComments(@PathVariable int id)
	{
		return poser.getAllComments(id);
	}
	
	@GetMapping(value="/{id}/comments/{cId}")
	public Comment get_a_Comments(@PathVariable int id, @PathVariable int cId)
	{
		return poser.get_a_Comment(id,cId);
	}
	
	@PostMapping(value="/{id}/comments")
	public Iterable<Comment> addComment(@PathVariable int id, @RequestBody Comment cmt)
	{
		return poser.add_a_Comment(id, cmt);
	}
	
	@PutMapping(value="/{id}/comments/{cId}")
	public Comment update_Comment(@PathVariable int id,@PathVariable int cId,
			                                                    @RequestBody Comment cmt)
	{
		return poser.update_a_Comment(id, cId, cmt);
	}
	
	@DeleteMapping(value="/{id}/comments/{cId}")
	public Iterable<Comment> deleteComment(@PathVariable int id, @PathVariable int cId)
	{
		return poser.delete_a_Comment(id, cId);
	}
	
	
	
	
	
	
}
