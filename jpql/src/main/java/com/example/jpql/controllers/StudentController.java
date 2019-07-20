package com.example.jpql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpql.beans.Student;
import com.example.jpql.service.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentController
{
	@Autowired
	private StudentService serv;
	
   @GetMapping(value="/all")
   public List<Student> getAllStudents()
   {
	   return serv.getAllStudents();
   }
   
   @PostMapping
   public List<Student> add_a_Student(@RequestBody Student student)
   {
	   return serv.add_a_Student(student);
   }
   
   @GetMapping
   public List<Student> get_By_Resident_Address(@RequestParam String address)
   {
	   return serv.findByAddress(address);
   }
   
   
}
