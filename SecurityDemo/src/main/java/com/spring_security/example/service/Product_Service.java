package com.spring_security.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_security.example.entity.Product;
import com.spring_security.example.repository.ProductRepository;

@Service
public class Product_Service
{
    @Autowired
    private ProductRepository prod_Repo;
    
    public Iterable<Product> getAllProducts()
    {
    	/*Product p1=
    			new Product(101,"Mobile",45000.00,"stephen Roger","Samsung Electronics","New Jersey",
    					"Paid(online payment mode)");
    	prod_Repo.save(p1);*/
    	
    	return prod_Repo.findAll();
    }
    
    public Product get_A_Product(int id)
    {
    	return prod_Repo.findOne(id);
    }
    
    public Iterable<Product> addProduct(Product product)
    {
    	prod_Repo.save(product);
    	return prod_Repo.findAll();
    }
    
    public Product updateProduct(int id, Product product)
    {
    	product.setProd_Id(id);
    	prod_Repo.save(product);
    	return product;
    }
    
    public Iterable<Product> deleteProduct(int id)
    {
    	prod_Repo.delete(id);
    	return prod_Repo.findAll();
    }
}
