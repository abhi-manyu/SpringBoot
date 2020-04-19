package com.practice.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.example.beans.Post;

@Repository
public interface PostRepository extends CrudRepository<Post,Integer>
{

}
