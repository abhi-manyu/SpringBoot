package com.spring_security.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring_security.example.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>
{
    @Query
    public List<Product> getAllProductsByBuyerName()
    {
    	
    }
}
