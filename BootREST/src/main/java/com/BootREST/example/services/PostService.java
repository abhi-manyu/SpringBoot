package com.BootREST.example.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BootREST.example.beans.Comment;
import com.BootREST.example.beans.Post;
import com.BootREST.example.repository.PostRepository;

@Service
public class PostService {
   
	@Autowired
	private PostRepository pore;
	
	public Iterable<Post> getAllPosts()
	{
		Post po1=new Post(101,"this is the first post","steve roger");
		List<Comment> comments=new ArrayList<>();
		comments.add(new Comment(111,"this is the first comment","Haward bruce"));
		comments.add(new Comment(222,"this is the second comment","hammer bryan"));
		po1.setComments(comments);
		pore.save(po1);
		return pore.findAll();
	}
	
	public Post get_a_Post(int id)
	{
		return pore.findOne(id);
	}
	public Iterable<Post> addPost(Post post)
	{
		pore.save(post);
		return pore.findAll();
	}
	
	public Post updatePost(int id,Post post)
	{
		post.setId(id);
		pore.save(post);
		return post;
	}
	
	public Iterable<Post> deletePost(int id)
	{
		pore.delete(id);
		return pore.findAll();
	}
	
	public Iterable<Comment> getAllComments(int id)
	{
		Post post=pore.findOne(id);
		return post.getComments();
	}
	
	public Comment get_a_Comment(int id, int cId)
	{
		Post post=pore.findOne(id);
		List<Comment> comments=post.getComments();
		Iterator<Comment> itr=comments.iterator();
		while(itr.hasNext())
		{
			Comment cmt=itr.next();
			if(cmt.getCid()==cId)
				return cmt;
		}
		return null;
	}
	
	
	public Iterable<Comment> add_a_Comment(int id, Comment cmt)
	{
		Post post=pore.findOne(id);
		List<Comment> comments=post.getComments();
		comments.add(cmt);
		pore.save(post);
		return comments;
	}
	
	public Comment update_a_Comment(int id,int cId,Comment cmt)
	{
		Post post=pore.findOne(id);
		List<Comment> comments=post.getComments();
		Iterator<Comment> itr=comments.iterator();
		while(itr.hasNext())
		{
			Comment temp=itr.next();
			if(temp.getCid()==cId)
			{
				comments.set(comments.indexOf(temp),cmt);
				post.setComments(comments);
				pore.save(post);
				return cmt;
			}
		}
		return null;
	}
	
	public Iterable<Comment> delete_a_Comment(int id, int cId)
	{
		Post post=pore.findOne(id);
		List<Comment> comments=post.getComments();
		Iterator<Comment> itr=comments.iterator();
		while(itr.hasNext())
		{
			Comment cmt=itr.next();
			if(cmt.getCid()==cId)
			{
				itr.remove();
				post.setComments(comments);
				pore.save(post);
			}
		}
		return comments;
	}
	
	
	
	
	
}
