package com.subresource.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subresource.example.beans.Comment;
import com.subresource.example.repository.CommentRepository;

@Service
public class CommentService
{
    @Autowired
    private CommentRepository cmtrepo;
    
    public Iterable<Comment> getAllComments()
    {
    	return cmtrepo.findAll();
    }
}
