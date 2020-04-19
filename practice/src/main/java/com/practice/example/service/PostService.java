package com.practice.example.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.example.beans.Comment;
import com.practice.example.beans.Post;
//import com.practice.example.repository.CommentRepository;
import com.practice.example.repository.PostRepository;

@Service
public class PostService
{
	
	@Autowired
	private PostRepository postRepo;
	
	/*
	 * @Autowired private CommentRepository commentRepo;
	 */

	/*
	 * public PostService() { System.out.println("inside construcotr"); Post post =
	 * new Post(101, "Abhimanyu", "this is first post");
	 * System.out.println("object is created"); postRepo.save(post);
	 * System.out.println("object is saved"); }
	 */
	
	
	
	public Iterable<Post> getAllPosts()
	{
		Post post = new Post(101, "Abhimanyu", "this is first post",
				Calendar.getInstance().getTime());
		
		Comment cmt1 = new Comment(111,"Anirudha","this is first comment",
				Calendar.getInstance().getTime());
		Comment cmt2 = new Comment(222,"Charulata","this is ssecond comment",
				Calendar.getInstance().getTime());
		List<Comment> comments = new ArrayList<Comment>();
		comments.add(cmt1);
		comments.add(cmt2);
		post.setComments(comments);
		
		postRepo.save(post);
		return postRepo.findAll();
	}
	
	
	// there is a new method instead of findOne() method that was present before.
	// previously the findOne() method was getting a single entity if it is 
	// present based on the primary key , that same thing here new method findById()
	// method is doing.
	// the only difference is that the old method is returning a Entity type and if 
	// entity not found then it was returning null.
	// but this new method id returning Optional to avoid null pointerException
	// sometimes. But if we want to return null if incase not found case then we can
	// write as bellow example
	public Post getSinglePost(int id)
	{
		return postRepo.findById(id).orElse(null);
	}
	
	public Iterable<Post> addPost(Post post)
	{
		postRepo.save(post);
		return postRepo.findAll();
	}
	
	
	public Iterable<Post> deletePost(int postID)
	{
		postRepo.delete(postRepo.findById(postID).get());
		return postRepo.findAll();
	}
	
	
	
	public List<Comment> getAllComments(int postId)
	{
		return postRepo.findById(postId).get().getComments();
	}
	
	
	public Comment getComment(int postID, int commentID)
	{
		Post post = postRepo.findById(postID).orElse(null);
		List<Comment> comments = post.getComments();
		for(Comment cmt : comments)
		{
			if(cmt.getCommentId()==commentID)
				return cmt;
		}
		return null;
	}
	
	public List<Comment> addComment(int postID,Comment comment)
	{
		Post post = postRepo.findById(postID).orElse(null);
		List<Comment> comments = post.getComments();
		comments.add(comment);
		postRepo.save(post);
		return getAllComments(postID);
	}
	
	public List<Comment> deleteComments(int postId, int commentId)
	{
		Post post = postRepo.findById(postId).orElse(null);
		List<Comment> comments = post.getComments();
		Iterator<Comment> itr = comments.iterator();
		while(itr.hasNext())
		{
			if(itr.next().getCommentId()==commentId)
				itr.remove();
		}
		post.setComments(comments);
		postRepo.save(post);
		return comments;
	}
}
