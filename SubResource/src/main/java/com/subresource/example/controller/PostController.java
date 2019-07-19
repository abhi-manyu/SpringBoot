package com.subresource.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subresource.example.beans.Comment;
import com.subresource.example.beans.Post;
import com.subresource.example.service.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostController
{
	@Autowired
	private PostService poserv;
	
   @GetMapping
   public Iterable<Post> getAllPosts()
   {
	   return poserv.getAllPosts();
   }
   
   @GetMapping(value="/{id}")
   public Post getPost(@PathVariable int id)
   {
	   return poserv.getPost(id);
   }
   
   @PostMapping
   public Iterable<Post> addPost(@RequestBody Post post)
   {
	   return poserv.addPost(post);
   }
   
   /*@RequestMapping(value="/{id}/comments")
   public CommentController getCommentController()
   {
	   return new CommentController();
   }*/
   
   @GetMapping(value="/{poid}/comments")
   public Iterable<Comment> getAllComments(@PathVariable int poid)
   {
	   return poserv.getAllComments(poid);
   }
}
