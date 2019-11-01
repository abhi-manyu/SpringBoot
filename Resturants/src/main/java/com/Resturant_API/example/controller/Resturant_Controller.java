package com.Resturant_API.example.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public Resturant getAResturant(@PathVariable int restId,Model mod)
    {
    	
    	mod.addAttribute("resturant", restService.getById(restId));
    	//return new ModelAndView("singleResturant");
    	return restService.getById(restId);
    }
    
    @PostMapping
    public Iterable<Resturant> addOneResturant(@RequestBody Resturant resturant)
    {
    	return restService.addOneResturant(resturant);
    }
    
    @PutMapping(value="/{id}")
    public ModelAndView updateResturant(@RequestBody Resturant resturant,
    		                                @PathVariable int id,Model mod)
    {
    	mod.addAttribute("update_rest",restService.updateResturant(resturant, id));
    	System.out.println("it is updatd");
    	return new ModelAndView("updatedResturant");
    }
}
