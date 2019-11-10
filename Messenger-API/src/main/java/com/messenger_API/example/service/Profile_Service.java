package com.messenger_API.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger_API.example.beans.Message;
import com.messenger_API.example.beans.Profile;
import com.messenger_API.example.repository.Profile_Repository;

@Service
public class Profile_Service
{
	@Autowired
    private Profile_Repository prof_Repo;
	
	public Iterable<Profile> getAllMessengers()
	{
		System.out.println("profile adding");
		Profile prf = new Profile(101,"steve","Roger","i_steve@Roger",
		 		            "Steve#Roger",45,"NewYork","steve@roger@avengers.com");
		prof_Repo.save(prf);
		System.out.println("profile added successfully");
		return prof_Repo.findAll();
	}
	
	public Profile getAMessenger(int id)
	{
		return prof_Repo.findOne(id);
	}
	
	public Iterable<Profile> add_A_Messenger(Profile prof)
	{
		 prof_Repo.save(prof);
		 return prof_Repo.findAll();
	}
	
	public Profile updateMessenger(int id, Profile prof)
	{
		prof.setProf_Id(id);
		prof_Repo.save(prof);
		return prof;
	}
	
	public Iterable<Profile> delete_A_Messenger(int id)
	{
		prof_Repo.delete(id);
		return prof_Repo.findAll();
	}
	
	public Iterable<Message> gteAllMessages(int id)
	{
		Profile pf=prof_Repo.findOne(id);
		return pf.getMessages();
		
	}
	
	public Iterable<Message> add_a_Message(int id, Message msg)
	{
		Profile pf=prof_Repo.findOne(id);
		List<Message> messages=pf.getMessages();
		messages.add(msg);
		prof_Repo.save(pf);
		return pf.getMessages();
	}
	
	public Message get_a_Message(int id, int mid)
	{
		Profile pf=prof_Repo.findOne(id);
		List<Message> messages=pf.getMessages();
		for(Message msg: messages)
		{
			if(msg.getMsg_Id()==mid)
				return msg;
		}
		return null;
	}
	
}
