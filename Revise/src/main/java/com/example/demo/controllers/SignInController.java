package com.example.demo.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MailService;

@RestController
@RequestMapping("/")
public class SignInController
{

	@Autowired
	private MailService mailServ;
	
	@GetMapping(value="/sendMail")
	public void sendmail() throws MessagingException
	{
		//mailServ.sendMail();
		mailServ.sendHtmlMessage();
		System.out.println("mail sent successfully");
	}
}
