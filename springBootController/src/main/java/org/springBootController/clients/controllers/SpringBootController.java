package org.springBootController.clients.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

	@RequestMapping(value="/")
	public String sayHello()
	{
		return "Hello abhi";
	}
	
	@RequestMapping(value="/abhi")
	public String sayHelloTo()
	{
		return " hello : Abhimanyu moharana";
	}
}
