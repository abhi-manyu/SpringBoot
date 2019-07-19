package com.subresource.example.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subresource.example.beans.Comment;
import com.subresource.example.beans.Post;
import com.subresource.example.repository.PostRepository;

@Service
public class PostService
{
     @Autowired
     private PostRepository porepo;
     
     public Iterable<Post> getAllPosts()
     {
    	 System.out.println("method called");
    	 List<Comment> comments=new ArrayList<>();
    	 comments.add(new Comment(111,"first Comment"));
    	 comments.add(new Comment(222,"second Comment"));
    	 System.out.println(comments);
    	 
    	 Post post=new Post(101,"Hello world");
    	 
    	 post.setComments(comments);
    	 porepo.save(post);
    	 return porepo.findAll();
     }
     
     public Post getPost(int id)
     {
    	 return porepo.findOne(id);
     }
     
     public Iterable<Post> addPost(Post post)
     {
    	 porepo.save(post);
    	 return porepo.findAll();
     }
     
     
     public Iterable<Comment> getAllComments(int id)
     {
    	 Post post=porepo.findOne(id);
    	 return post.getComments();
     }
}
