package com.messenger_API.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messenger_API.example.beans.Message;
import com.messenger_API.example.service.MessageService;

//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"},maxAge = 3600)
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping({"/messages"})
public class Message_Controller
{
    @Autowired
    private MessageService msg_Serv;
    
    @GetMapping
    public Iterable<Message> getAllMessages()
    {
    	System.out.println("in controller");
    	return msg_Serv.getAllMessages();
    }
    
    @GetMapping(value="/{id}")
    public Message getMessage(@PathVariable int id)
    {
    	return msg_Serv.get_A_Message(id);
    }
    
    @PostMapping
    public Iterable<Message> addMessage(@RequestBody Message msg)
    {
    	return msg_Serv.addMessage(msg);
    }
    
    @PutMapping(value="/{id}")
    public Message updateMessage(@RequestBody Message msg, @PathVariable int id)
    {
    	return msg_Serv.updateMessage(id, msg);
    }
    
    @DeleteMapping(value="/{id}")
    public Iterable<Message> deleteMessage(@PathVariable int id)
    {
    	return msg_Serv.deleteMessage(id);
    }
}
