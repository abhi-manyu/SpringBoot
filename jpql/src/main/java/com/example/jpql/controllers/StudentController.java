package com.example.jpql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.jpql.beans.Student;
import com.example.jpql.service.StudentService;

@RestController
//@Controller
//@ResponseBody
@RequestMapping(value="/students")
public class StudentController
{
	@Autowired
	private StudentService serv;
	
    @GetMapping(value="/all",produces= {"application/xml"})
	//@GetMapping(value="/all")
	public List<Student> getAllStudents(@RequestParam(required=false) boolean sorted)
   {
	   System.out.println("in controller");
	   if(sorted==false)
	   {
		   List<Student> students=serv.getAllStudents();
	       return students;
	   }
	   else
		   return serv.getAllStudentBySorted();
   }
   
   @PostMapping
   public List<Student> add_a_Student(@RequestBody Student student)
   {
	   return serv.add_a_Student(student);
   }
   
   @GetMapping
   public List<Student> get_By_Resident_Address(@RequestParam(required=false)String address)
   {
	   return serv.findByAddress(address);
   }
   
   @GetMapping(value="/{id}")
   public ModelAndView get_a_Student(@PathVariable int id)
   {
	   ModelAndView mod=new ModelAndView("out");
	   mod.addObject("student",serv.find_a_Student(id));
	   return mod;
   }
   
   
}
