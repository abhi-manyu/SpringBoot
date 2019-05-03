package org.courseApi.example.course;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService
{
	//@Autowired
	//private CourseData courseData;
	
	private static List<Course> courses=new ArrayList<>();
    static {
	   Course c1=new Course(101,"Spring","ragarding spring framework");
   	   Course c2=new Course(201,"Hibernate","ragarding java persistance framework");
   	   Course c3=new Course(301,"Webservice","ragarding inter app communuication");
   	 
	  courses.add(c1);
	  courses.add(c2);
	  courses.add(c3);
     }
   
   public List<Course> getAllCourses()
   {
	   /*List<Course> courses=new ArrayList<>();
	   courseData.findAll().forEach(courses::add);
	   return courses;*/
	   
	   return courses;
	   
   }
   
   public Course getCourse(int course_Id)
   {
	   Iterator<Course> itr=courses.iterator();
	   while(itr.hasNext())
	   {
		   Course course=itr.next();
		   if(course.getCourseId()==course_Id)
			   return course;
	   }
	   return null;
   }
   
   public List<Course> addCourse(Course course)
   {
	  courses.add(course);
	  return courses;
   }
   
   public Course updateCourse(int id,Course course)
   {
	   for(int i=0;i<courses.size();i++)
	   {
		   Course co=courses.get(i);
		   if(co.getCourseId()==id)
		   {
			   courses.set(i,course);
			   return course;
		   }
	   }
	   return null;
   }
    
   
   public List<Course> deleteCourse(int id)
   {
	   for(int i=0;i<courses.size();i++)
	   {
		   if(courses.get(i).getCourseId()==id)
		   {
			   courses.remove(i);
			   return courses;
		   }
	   }
	   return courses;
   }
}
