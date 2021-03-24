package com.example.Revise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/errors")
public class ErrorController
{
    @GetMapping(value="/error")
    public String showErrorMessage()
    {
    	return "some error occured" ;
    }
    
    @GetMapping
    public String showWithName(@RequestParam("name") String aname,
    		@RequestParam("error") String error)
    {
    	error="array index of bound error";
    	return "hi "+aname+" "+error+" occured";
    }
}
