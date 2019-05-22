package org.courseApi.example.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.courseApi.example.course.Course;
import org.courseApi.example.course.CourseService;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    private List<Course> courses=CourseService.getCourses();
    
    public List<Student> get_All_Student_From_a_Course(int cId)
    {
 	   Iterator<Course> itr=courses.iterator();
 	   while(itr.hasNext())
 	   {
 		   Course course=itr.next();
 		   if(course.getCourseId()==cId)
 		   {
 			   List<Student> students=new ArrayList<>();
 			   students=course.getStudents();
 			   if(students.size()>0)
 				   return students;
 			   else
 				   return null;
 		   }
 	   }
 	   return null;
    }
    
    public Student get_a_Stuent_From_a_Course(int cId,int sId)
    {
   	 Iterator<Course> itr=courses.iterator();
   	 while(itr.hasNext())
   	 {
   		 Course course=itr.next();
   		 if(course.getCourseId()==cId)
   		 {
   			 List<Student> students=course.getStudents();
   			 if(students.size()>0)
   			 {
   				 Iterator<Student> itr2=students.iterator();
   				 while(itr2.hasNext())
   				 {
   					 Student student=itr2.next();
   					 if(student.getRollNo()==sId)
   						 return student;
   				 }
   			 }
   			 return null;
   		 }
   		 return null;
   	 }
   	 return null;
    }
      
     public List<Student> addStudentTo_a_Course(int cId,Student student)
     {
   	  Iterator<Course> itr=courses.iterator();
   	  List<Student> students=new ArrayList<>();
   	  while(itr.hasNext())
   	  {
   		  Course course=itr.next();
   		  if(course.getCourseId()==cId)
   		  {
   			  students=course.getStudents();
   			  if(student!=null)
   			  {
   				  students.add(student);
   				  return students;
   			  }
   		  }
   	  }
   	  return students;
     }
      
    
    
    
}
