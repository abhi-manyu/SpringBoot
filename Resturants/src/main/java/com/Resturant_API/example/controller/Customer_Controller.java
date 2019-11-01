package com.Resturant_API.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Resturant_API.example.beans.Customer;
import com.Resturant_API.example.service.CustomerService;

@RestController
@RequestMapping(value="/customers")
public class Customer_Controller
{
    @Autowired
    private CustomerService custServ;
    
    @GetMapping
    public Iterable<Customer> getAllCustomer()
    {
    	return custServ.getAllCustomer();
    }
    
    @PostMapping
    public Iterable<Customer> addOneCustomer(@RequestBody Customer customer)
    {
    	return custServ.addOneCustomer(customer);
    }
    
    @GetMapping(value="/{custId}")
    public ModelAndView getACustomer(@PathVariable int custId, Model mod)
    {
    	 mod.addAttribute("customer",custServ.getOneCustomer(custId));
    	 return new ModelAndView("singleCustomer");
    }
}
