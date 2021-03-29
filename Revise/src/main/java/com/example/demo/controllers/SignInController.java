package com.example.demo.controllers;

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
	public void sendmail()
	{
		mailServ.sendMail();
		System.out.println("mail sent successfully");
	}
}
