package com.messenger_API.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger_API.example.beans.Message;
import com.messenger_API.example.repository.MessageRepository;

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
	
	public Iterable<Message> addMessage(Message msg)
	{
		if(msg!=null)
			msg_repo.save(msg);
		 return msg_repo.findAll();
	}
	
	public Message updateMessage(int id, Message msg)
	{
		msg.setMsg_Id(id);
		msg_repo.save(msg);
		return msg;
	}
	
	public Iterable<Message> deleteMessage(int id)
	{
		msg_repo.delete(id);
		return msg_repo.findAll();
	}
}
