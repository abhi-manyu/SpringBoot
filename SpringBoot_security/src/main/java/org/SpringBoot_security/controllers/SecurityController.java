package org.SpringBoot_security.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController
{
    @RequestMapping(value="/userlogin")
    public String userValidation()
    {
    	return "hello user, u logged in successfully";
    }
    
    @RequestMapping(value="/adminlogin")
    public String adminValidation()
    {
    	return "hello Admin u loged in successfully";
    }
    
}
