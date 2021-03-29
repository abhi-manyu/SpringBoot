package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSender;
	public void sendMail()
	{
		SimpleMailMessage  msg = new SimpleMailMessage();
		
		msg.setTo("abhimanyumoharana144@gmail.com");
		msg.setSubject("testing spring boot mail");
		msg.setText("this is a test mail from spring boot");
		
		mailSender.send(msg);
	}
}
