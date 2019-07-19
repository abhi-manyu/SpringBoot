package com.subresource.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subresource.example.beans.Comment;
import com.subresource.example.service.CommentService;

@RestController
@RequestMapping(value="/comments")
public class CommentController
{
	@Autowired
	private CommentService cmtserv;
	
   @GetMapping
   public Iterable<Comment> getAllComments()
   {
	   System.out.println("comment resource method called");
	   return cmtserv.getAllComments();
   }
}
