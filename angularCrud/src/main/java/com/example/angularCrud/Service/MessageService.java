package com.example.angularCrud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.angularCrud.model.Message;
import com.example.angularCrud.Repo.MessageRepository;


@Service
public class MessageService 
{
	@Autowired
    private MessageRepository  msg_repo;
	
	public Iterable<Message> getAllMessages()
	{
		
		/*Message msg1=new Message(101,"Hello world","abhimanyu","arabinda");
		msg_repo.save(msg1);
		System.out.println("in service, data is saved to database");*/
		return msg_repo.findAll();
	}
	
	public Message get_A_Message(int id)
	{
		return msg_repo.findOne(id);
	}
	
	
}
