package com.Resturant_API.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Resturant_API.example.beans.Customer;
import com.Resturant_API.example.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository custRepo;
	
	public Iterable<Customer> getAllCustomer()
	{
		Customer cust = new Customer(111,"Tom hank","new Jersey");
		custRepo.save(cust);
	    return custRepo.findAll();
	}

	public Iterable<Customer> addOneCustomer(Customer customer)
	{
		custRepo.save(customer);
		return custRepo.findAll();
	}
	
	
	public Customer getOneCustomer(int custId)
	{
		return custRepo.findOne(custId);
	}
	
	
	
}
