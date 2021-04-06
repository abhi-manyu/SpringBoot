package com.example.demo.service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSender;
	/*public void sendMail()
	{
		SimpleMailMessage  msg = new SimpleMailMessage();
		
		msg.setTo("abhimanyumoharana144@gmail.com");
		msg.setSubject("testing spring boot mail");
		msg.setText("<h2>test mail from spring boot</h2>"
				+ "<p>this is a test mail from spring boot</p>");
		
		mailSender.send(msg);
	}
	*/
	
	/*public void sendmailwithAttachment() throws MessagingException
	{
		MimeMessage message = mailSender.createMimeMessage();
		
		MimeMessageHelper mimMesageHelper = 
				new MimeMessageHelper(message, true);
		
		mimMesageHelper.setSubject("testing with attachment");
		mimMesageHelper.setTo("abhimanyumoharana144@gmail.com");
		mimMesageHelper.setText("this is to check is attachments are working in spring boot");
		
		FileSystemResource file =
				new FileSystemResource(new File("C:\\abhi\\GIT_HUB\\GIT\\GIT_local\\SpringBoot\\Revise\\src\\main\\java\\attachment.txt"));
		mimMesageHelper.addA
		
	}*/
	
	
	
	public void sendHtmlMessage() throws MessagingException
	{
		MimeMessage msg = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg);
		helper.setSubject("this is a html message");
		helper.setTo("abhimanyumoharana144@gmail.com");
		
		boolean html = true;
		
		helper.setText("<h2>test mail from spring boot</h2>"
				+ "<p>this is a test mail from spring boot</p>"
				+ "<u><a href = \"www.google.com\">"
				+ "if want to unsubscribe please click on below link</></u>",html);
		mailSender.send(msg);
	}
	
	
	
}
