package com.example.angularCrud.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.angularCrud.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message,Integer>
{
    
}
