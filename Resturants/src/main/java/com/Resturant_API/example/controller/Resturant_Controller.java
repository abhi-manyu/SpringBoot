package com.Resturant_API.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Resturant_API.example.beans.Resturant;
import com.Resturant_API.example.service.ResturantService;

@RestController
@RequestMapping(value="/resturants")
public class Resturant_Controller
{
	@Autowired
	private ResturantService restService;
	
    @GetMapping
    public ModelAndView getAllResturants(Model mod)
    {
    	mod.addAttribute("resturants",restService.getAllResturants());
    		return new ModelAndView("allResturants");
    }
    
    @GetMapping(value="/{restId}")
    public ModelAndView getAResturant(@PathVariable int restId,Model mod)
    {
    	
    	mod.addAttribute("resturant", restService.getById(restId));
    	return new ModelAndView("singleResturant");
    }
    
    @PostMapping
    public Iterable<Resturant> addOneResturant(@RequestBody Resturant resturant)
    {
    	return restService.addOneResturant(resturant);
    }
}
