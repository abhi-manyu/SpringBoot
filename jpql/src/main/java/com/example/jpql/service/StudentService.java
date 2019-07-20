package com.example.jpql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpql.beans.Student;
import com.example.jpql.repository.StudentRepository;

@Service
public class StudentService {
 
	@Autowired
	private StudentRepository srepo;
	
	public List<Student> getAllStudents()
	{
		Student st1=new Student(101,"Abhimanyu","Bangalore");
		Student st2=new Student(202,"Arabinda","Bhubaneswar");
		 srepo.save(st1);
		 srepo.save(st2);
		
		return srepo.findAll();
	}
	
	public List<Student> add_a_Student(Student student)
	{
		srepo.save(student);
		return srepo.findAll();
	}
	
	public List<Student> findByAddress(String address)
	{
		return srepo.findByAddress(address);
				
	}
	
}
