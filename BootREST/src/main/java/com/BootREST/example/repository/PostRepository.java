package com.BootREST.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BootREST.example.beans.Post;

@Repository
public interface PostRepository extends CrudRepository<Post,Integer> {

}
