package com.example.angularCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.angularCrud.model.Message;
import com.example.angularCrud.Service.MessageService;



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
}
    