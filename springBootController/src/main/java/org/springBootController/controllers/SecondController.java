package org.springBootController.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController
{
   @RequestMapping("/")
   		public String sayHello()
   		{
   			return "hello Ara";
   		}
   @RequestMapping(value="/ara")
   public String sayHelloTo()
   {
	   return "hello Arabinda moharana";
   }
}
