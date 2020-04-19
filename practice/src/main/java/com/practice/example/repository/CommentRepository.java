package com.practice.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.example.beans.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
