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
}
