package com.spring_security.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security.example.entity.Product;
import com.spring_security.example.service.Product_Service;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping(value="/products")
@RestController
public class ProductController
{
	
	@Autowired
	private Product_Service prod_Service;
	
    @GetMapping
    public Iterable<Product> getAllProducts()
    {
    	return prod_Service.getAllProducts();
    }
    
    @GetMapping(value="/{id}")
    public Product get_A_Product(@PathVariable("id")int id)
    {
    	return prod_Service.get_A_Product(id);
    }
    @PostMapping
    public Iterable<Product> addProduct(@RequestBody Product product)
    {
    	return prod_Service.addProduct(product);
    }
    
    @PutMapping(value="/{id}")
    public Product updateProduct(@PathVariable("id")int id,
    		@RequestBody Product product)
    {
    	return prod_Service.updateProduct(id, product);
    }
    
    @DeleteMapping(value="/{id}")
    public Iterable<Product> deleteProduct(@PathVariable("id")int id)
    {
    	return prod_Service.deleteProduct(id);
    }
}
