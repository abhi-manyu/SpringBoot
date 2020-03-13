package com.newVersion.example.controller;

import java.util.Iterator;
import java.util.List;

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
		int sum=0;
		Iterator<CoronaVirusData> itr = alldata.iterator();
		while(itr.hasNext())
		{
			sum+=itr.next().getTotal_as_of_Now();
		}
		mod.addAttribute("alldata", service.getMyDatas());
		mod.addAttribute("total",sum);
		return new ModelAndView("details");
	}
}
