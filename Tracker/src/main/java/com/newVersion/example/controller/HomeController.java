package com.newVersion.example.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.newVersion.example.entities.CoronaVirusData;
import com.newVersion.example.service.CoronaTrackingService;
import com.newVersion.example.service.WrapupCountries;

@RestController
public class HomeController {

	@Autowired
	WrapupCountries service;

	@GetMapping("/")
	public ModelAndView home(Model mod)
	{
		List<CoronaVirusData> alldata = new ArrayList<>(service.getMyDatas().values());

		int sum = 0;
		int deaths=0;
		CoronaVirusData temp=null;
		Iterator<CoronaVirusData> itr = alldata.iterator();
		while (itr.hasNext())
		{
			temp = itr.next();
			sum += temp.getTotal_Confirmed_Cases();
			deaths+=temp.getTotal_Deaths();
		}
		
		mod.addAttribute("alldata", alldata);
		mod.addAttribute("total", sum);
		mod.addAttribute("tot_death",deaths);

		return new ModelAndView("details");
	    //return null;
	}
	@GetMapping(value="/{country}")
	public String getIndividualContryDetails(@PathVariable String country)
	{
		return " i m in country : "+country;
	}
	
	
}
