package com.employeeManagement.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagement.example.beans.Employee;
import com.employeeManagement.example.service.EmployeeService;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController
{
   @Autowired
   private EmployeeService empServ;
   
   
   @GetMapping
   public Iterable<Employee> getAllEmployees()
   {
	   return empServ.getAllEmployee();
   }
   
   @GetMapping(value="/{id}")
   public Employee get_a_Employees(@PathVariable int id)
   {
	   return empServ.get_a_Employee(id);
   }
   
   
   
}
