package com.Resturant_API.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Resturant_API.example.beans.Resturant;
import com.Resturant_API.example.repository.ResturantRepository;

@Service
public class ResturantService
{
	@Autowired
	private ResturantRepository restRepo;
	
	public Iterable<Resturant> getAllResturants()
	{
	    
 	    Resturant rest = new Resturant(101,"hill side food","Manhattan","Steve Roger",4.5);
 	    restRepo.save(rest);
		return restRepo.findAll();
	}

	public Iterable<Resturant> addOneResturant(Resturant resturant)
	{
		restRepo.save(resturant);
		return restRepo.findAll();
	}
	
    public Resturant getById(int resturantId)
    {
    	return restRepo.getById(resturantId);
    }
}
