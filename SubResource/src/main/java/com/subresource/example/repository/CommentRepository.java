package com.subresource.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subresource.example.beans.Comment;
@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer>
{
    
}
