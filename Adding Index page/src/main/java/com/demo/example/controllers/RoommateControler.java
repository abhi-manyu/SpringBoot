package com.demo.example.controllers;

import java.util.List;

import org.hibernate.annotations.Formula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.beans.Roomate;
import com.demo.example.service.RoommateService;

@RestController
public class RoommateControler {

	@Autowired
	private RoommateService rms;
	
	@GetMapping(value="/getAllRoomates")
	public List<Roomate> getAllRoomates()
	{
		return rms.getAllroomates();
	}
	
	@PostMapping
	public String addRoomates(@RequestBody Roomate roommate)
	{
		return rms.addOneRoommate(roommate);
	}
	
}
