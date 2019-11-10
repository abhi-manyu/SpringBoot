package com.messenger_API.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messenger_API.example.beans.Message;
import com.messenger_API.example.beans.Profile;
import com.messenger_API.example.service.Profile_Service;

@RestController
@RequestMapping(value="/profiles")
public class ProfileController
{
	@Autowired
	private Profile_Service prof_Serv;
	
   @GetMapping
   public Iterable<Profile> getAllMessengers()
   {
	   return prof_Serv.getAllMessengers();
   }
   
   @GetMapping(value="/{id}")
   public Profile get_A_Messenger(@PathVariable int id)
   {
	   return prof_Serv.getAMessenger(id);
   }
   
   @PostMapping
   public Iterable<Profile> add_A_Messenger(@RequestBody Profile prof)
   {
	   return prof_Serv.add_A_Messenger(prof);
   }
   
   @PutMapping(value="/{id}")
   public Profile updateMessenger(@PathVariable int id, @RequestBody Profile prof)
   {
	  return prof_Serv.updateMessenger(id, prof);
   }
   
   @DeleteMapping(value="/{id}")
   public Iterable<Profile> delete_A_Messenger(@PathVariable int id)
   {
	   return prof_Serv.delete_A_Messenger(id);
   }
   
   @GetMapping(value="/{id}/messages")
   public Iterable<Message> getMessageController(@PathVariable int id)
   {
	   return prof_Serv.gteAllMessages(id);
   }
   
   @PostMapping(value="/{id}/messages")
   public Iterable<Message> add_a_Message(@PathVariable int id ,@RequestBody Message msg)
   {
	  return prof_Serv.add_a_Message(id, msg);
   }
   
   @GetMapping(value="/{id}/messages/{mid}")
   public Message getMessageController(@PathVariable int id, @PathVariable int mid)
   {
	   return prof_Serv.get_a_Message(id, mid);
   }
   
}
