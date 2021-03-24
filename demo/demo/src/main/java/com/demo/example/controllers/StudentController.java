package com.demo.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.example.beans.Student;
import com.demo.example.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studServ; 
	
	@GetMapping(value="/getallstudents")
	public List<Student> getAllStudents()
	{
		System.out.println("returning all students");
		return studServ.getAllStudents();
	}
	
	@PostMapping
	public String addOneStudent(@RequestBody Student student)
	{
		return studServ.addOneStudent(student);
	}
}
