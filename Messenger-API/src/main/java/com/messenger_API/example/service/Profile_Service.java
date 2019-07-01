package com.messenger_API.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messenger_API.example.beans.Profile;
import com.messenger_API.example.repository.Profile_Repository;

@Service
public class Profile_Service
{
	@Autowired
    private Profile_Repository prof_Repo;
	
	public Iterable<Profile> getAllMessengers()
	{
		Profile prf = new Profile(101,"steve","Roger","i_steve@Roger",
		 		            "Steve#Roger",45,"NewYork","steve@roger@avengers.com");
		prof_Repo.save(prf);
		return prof_Repo.findAll();
	}
	
	public Profile getAMessenger(int id)
	{
		return prof_Repo.findOne(id);
	}
	
	public Iterable<Profile> add_A_Messenger(Profile prof)
	{
		 prof_Repo.save(prof);
		 return prof_Repo.findAll();
	}
	
	public Profile updateMessenger(int id, Profile prof)
	{
		prof.setProf_Id(id);
		prof_Repo.save(prof);
		return prof;
	}
	
	public Iterable<Profile> delete_A_Messenger(int id)
	{
		prof_Repo.delete(id);
		return prof_Repo.findAll();
	}
}
