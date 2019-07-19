package com.subresource.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subresource.example.beans.Post;

@Repository
public interface PostRepository extends CrudRepository<Post,Integer>
{

}
