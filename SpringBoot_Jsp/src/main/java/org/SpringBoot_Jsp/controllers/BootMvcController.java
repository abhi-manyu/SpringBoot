package org.SpringBoot_Jsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BootMvcController
{
   @RequestMapping("/hello")
   public ModelAndView showLoginPage(Model mod)
   {
	   mod.addAttribute("msg","Welcome everybody u guys are logged in");
	   return new ModelAndView("welcome");
   }
}
