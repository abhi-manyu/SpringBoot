package com.demo.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.beans.Roomate;
import com.demo.example.repository.RoommateRepository;

@Service
public class RoommateService {

	@Autowired
	private RoommateRepository rmr;
	
	public List<Roomate> getAllroomates()
	{
		rmr.save(new Roomate(101,"Abhimanyu","bangalore",56));
		return (List<Roomate>)rmr.findAll();
	}
	
	
	public String addOneRoommate(Roomate roommate)
	{
		Optional<Roomate> temp = rmr.findById(roommate.getRoomateId());
		System.out.println(temp);
		if(!temp.isPresent())
		{
			rmr.save(roommate);
			return "data added successfully" ;
		}
		
		return "the below record with same id is already present in database"+temp.get();
	}

	
}
