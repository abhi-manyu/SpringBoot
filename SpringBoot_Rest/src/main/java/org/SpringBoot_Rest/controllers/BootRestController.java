package org.SpringBoot_Rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.SpringBoot_Rest.beans.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootRestController
{
   @GetMapping(value="/countries", headers="Accept=application/json")
   public List<Country> getAllCountries()
   {
	   List<Country> countries=new ArrayList<Country>();
	   countries= returnAllcountries();
	   return countries;
   }
   
   
   
   
   
   public List<Country> returnAllcountries()
   {
	   List<Country> countries=new ArrayList<Country>();
	   Country c1=new Country(101,"India","New Delhi");
	   Country c2=new Country(201,"USA","New York");
	   Country c3=new Country(301,"Nepal","KathMandu");
	   Country c4=new Country(401,"Russia","Moscow");
	   
	   countries.add(c1);
	   countries.add(c2);
	   countries.add(c3);
	   countries.add(c4);
	   
	   return countries;
   }
}
