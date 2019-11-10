package com.messenger_API.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.messenger_API.example.beans.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message,Integer>
{
    
}
