package com.Resturant_API.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Resturant_API.example.beans.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
