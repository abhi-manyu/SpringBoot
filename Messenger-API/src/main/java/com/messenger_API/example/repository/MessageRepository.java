package com.messenger_API.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.messenger_API.example.beans.Message;

public interface MessageRepository extends CrudRepository<Message,Integer>
{
    
}
