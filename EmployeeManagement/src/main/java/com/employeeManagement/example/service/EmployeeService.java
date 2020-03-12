package com.employeeManagement.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagement.example.beans.Employee;
import com.employeeManagement.example.repository.EmployeeRepository;

@Service
public class EmployeeService
{
   @Autowired
   private EmployeeRepository empRepo;
   
   public Iterable<Employee> getAllEmployee()
   {
	   Employee emp1=
			   new Employee(101,"Rolf bratner","new jersey","Sicurity Analyst",45,'M',"mrd");
	   Employee emp2=
			   new Employee(102,"Steve Gendulf","Santa clara","Production marketing",24,'M',"unmrd");
	   
	   empRepo.save(emp1);
	   empRepo.save(emp2);

	   return empRepo.findAll();
   }
   
   public Employee get_a_Employee(int id)
   {
	   return empRepo.findOne(id);
   }
   
   
   
   
   
}
