package org.courseApi.example.course;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.courseApi.example.student.Student;
import org.springframework.stereotype.Service;

@Service
public class CourseService
{
	private static List<Course> courses=new ArrayList<>();
	public static List<Course> getCourses() {
		return courses;
	}
    static {
    	List<Student> students1=new ArrayList<>();
    	
    	Student s1=new Student(111,"Bill hidick",24,"Los Angels",89.35);
    	/*Student s2=new Student(222,"Thomas Robbin",27,"Queen city",56.85);
    	Student s3=new Student(333,"Peter mask",25,"new Jersey",91.73);*/
    	
    	students1.add(s1);
    	/*students1.add(s2);
    	students1.add(s3);*/
    	
	   Course c1=new Course(101,"Spring","ragarding spring framework");
	   c1.setStudents(students1);
   	   Course c2=new Course(201,"Hibernate","ragarding java persistance framework");
   	 
	  courses.add(c1);
	  courses.add(c2);
     }
   
   public List<Course> getAllCourses()
   {
	   
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
