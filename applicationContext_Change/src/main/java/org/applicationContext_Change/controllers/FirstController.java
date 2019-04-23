package org.applicationContext_Change.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController
{
   @RequestMapping(value="/")
   public String something()
   {
	   return "this is default context";
   }
   
   @RequestMapping(value="/something")
   public String showSomething()
   {
	   return "this demonstrates the usage of auto reloading "
	   		+ "and deploying of the code chages";
   }
}
