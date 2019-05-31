package com.example.controller;


import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
   public Iterable<Student> getAllStudents(@RequestParam(required=false)String lname)
   {
	   /*List<Integer> li=new ArrayList<>();
	   li.add(101);
	   li.add(102);*/
	   if(lname!=null)
		   return stdserv.getStudentByLastName(lname);
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
   @PutMapping(value="/{id}")
   public Student updateStudent(@RequestBody Student student, @PathVariable("id")int id)
   {
	  return stdserv.updateStudent(student, id);
   }
   
}
