package com.example.Revise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/messages")
public class MsgController
{
   @GetMapping
   public String displayMessage()
   {
	   return "Hi u r welcome to this application";
   }
}
