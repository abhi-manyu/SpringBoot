package com.newVersion.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.newVersion.example.entities.CoronaVirusData;
import com.newVersion.example.service.CoronaTrackingService;

@RestController
public class HomeController {

	@Autowired
	CoronaTrackingService service;

	@GetMapping("/")
	public ModelAndView home(Model mod)
	{
		List<CoronaVirusData> alldata = service.getMyDatas();
		mod.addAttribute("data",alldata);
		return new ModelAndView("details");
	}
	
	
	  @GetMapping(value="/country") public ModelAndView getCountries(Model mod) throws ClientProtocolException, IOException {
	  List<CoronaVirusData> list = new
	  ArrayList<CoronaVirusData>(service.something().values());
	  mod.addAttribute("data",list); return new ModelAndView("details"); }
	 
	
	
}
