package com.demo.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.beans.Student;
import com.demo.example.repository.StudentRepository;

@Service
public class StudentService
{
	@Autowired
	private StudentRepository stud_rep;
	
	public List<Student> getAllStudents()
	{
		stud_rep.save(new Student(101,"Abhimanyu","bangalore",56.23));
		return (List<Student>)stud_rep.findAll();
	}
	
	public String addOneStudent(Student student)
	{
		Optional<Student> temp = stud_rep.findById(student.getStudentId());
		System.out.println(temp);
		if(!temp.isPresent())
		{
			stud_rep.save(student);
			return "data added successfully" ;
		}
		
		return "the below record with same id is already present in database"+temp.get();
	}
}
