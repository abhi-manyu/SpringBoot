package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentController
{
   @Autowired
   private StudentService stdserv;
   
   @GetMapping
   public Iterable<Student> getAllStudents()
   {
	   return stdserv.getAllStudent();
   }
   @PostMapping
   public Iterable<Student> addStudent(@RequestBody Student student)
   {
	  return stdserv.addStudent(student);
   }
   
   @GetMapping(value="/{id}")
   public Student getStudent(@PathVariable("id") int sId)
   {
	   return stdserv.findStudent(sId);
   }
}
