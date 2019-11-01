package com.example.jpql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.jpql.beans.Student;
import com.example.jpql.repository.StudentRepository;

@Service
public class StudentService {
 
	@Autowired
	private StudentRepository srepo;
	
/*	@Scheduled(initialDelay=1000, fixedRate=10000)*/
	public List<Student> getAllStudents()
	{
		System.out.println("creating students");
		Student st1=new Student(101,"Abhimanyu","Bangalore",25,"unmiarried");
		Student st2=new Student(202,"Arabinda","Bhubaneswar",20,"unmiarried");
		 srepo.save(st1);
		 srepo.save(st2);
		
		 List<Student> students= srepo.findAll();
		 for(Student student:students)
		   {
			   System.out.println(student.getName());
		   }
		 return students;
	}
	
	public List<Student> add_a_Student(Student student)
	{
		srepo.save(student);
		return srepo.findAll();
	}
	
	public List<Student> findByAddress(String address)
	{
		return srepo.find_By_Address_in_SortedManner_By_Name(address);
	    //return srepo.findByAddress(address);	
	}
	
	
	public List<Student> getAllStudentBySorted()
	{
		System.out.println("returning sorted list of students");
		return srepo.getAllStudents_by_Sortingmanner();
	}
    
	public Student find_a_Student(int id)
	{
		return srepo.findOne(id);
	}
	
	
	
}
