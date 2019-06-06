package com.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Student;
import com.example.repository.StudentRepo;

@Service
public class StudentService
{
   @Autowired
   private StudentRepo stdrepo;
   
   public Iterable<Student> getAllStudent()
   {
	   /*Student s1=new Student(101,"Stuart","pensylvania");
	   stdrepo.save(s1);*/
	   return stdrepo.findAll();
	   //return stdrepo.findAll(li);
   }
   public Iterable<Student> addStudent(Student student)
   {
	   stdrepo.save(student);
	   return stdrepo.findAll();
   }
   
   /*public Optional<Student> findStudent(int id)
   {
	   return stdrepo.findById(id);
   }*/
   public Student findStudent(int id)
   {
	   return stdrepo.findOne(id);
   }
   
   public Student updateStudent(Student student,int id)
   {
	   student.setRln(id);
	   stdrepo.save(student);
	   return student;
   }
   
   public List<Student> getStudentByLastName(String lname)
   {
	   return stdrepo.readAllStudentByLname(lname);
   }
   
   public List<Student> findStudentByFnameAndAddress(String fname, String address)
   {
	   return stdrepo.findAllByFnameAndAddress(fname, address);
   }
   
   public Iterable<Student> deleteStudent(int del_Id)
   {
	   if(del_Id<0)
		   stdrepo.deleteAll();
	   else
		   stdrepo.delete(del_Id);
	   return stdrepo.findAll();
   }
}
