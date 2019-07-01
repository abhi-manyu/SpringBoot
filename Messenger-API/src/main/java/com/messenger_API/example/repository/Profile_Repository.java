package com.messenger_API.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.messenger_API.example.beans.Profile;

public interface Profile_Repository extends CrudRepository<Profile, Integer>
{

}
