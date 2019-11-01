package com.Resturant_API.example.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Resturant_API.example.beans.Resturant;

@Repository
public interface ResturantRepository extends CrudRepository<Resturant,Integer>
{
    
	@Query(value="from Resturant where id=?1")
	public Resturant getById(int resturantId);
}
