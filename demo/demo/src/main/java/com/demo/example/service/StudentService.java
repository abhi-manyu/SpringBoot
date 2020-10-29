package com.demo.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.example.beans.Student;

@Service
public class StudentService
{
   private List<Student> students;
   public StudentService() {
	  students = new ArrayList<Student>();
	  students.add(new Student(123, "Arabinda", "bhubanswar",82.35));
    }
   
   
	public List<Student> getAllStudents()
	{
		return students;
	}
	
	public List<Student> addOneStudent(Student student)
	{
		for(Student st:students)
		{
			if(st.getStudentId()==student.getStudentId())
			{
			   System.out.println("Data is already present, no need to enter again");
			   //students.set(students.indexOf(st),student);
			   return students;
			}
			
		}
		students.add(student)
;		return students;
	}
}
