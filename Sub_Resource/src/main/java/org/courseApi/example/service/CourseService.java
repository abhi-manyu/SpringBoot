package org.courseApi.example.service;

import org.courseApi.example.course.Course;
import org.courseApi.example.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService
{
    @Autowired
    private CourseRepo repo;
    
    public Iterable<Course> getAllCourses()
    {
    	Course cs=new Course(101,"REST API","regarding REST");
 	   repo.save(cs);
 	   return repo.findAll();
    }
    
    public Course getCourse(int course_Id)
    {
 	   return repo.findOne(course_Id);
    }
    
    public Iterable<Course> addCourse(Course course)
    {
 	  repo.save(course);
 	  return repo.findAll();
    }
    
    public Course updateCourse(int id,Course course)
    {
 	  course.setCourseId(id);
 	  repo.save(course);
 	  return course;
    }
     
    
    public Iterable<Course> deleteCourse(int id)
    {
 	   repo.delete(id);
 	   return repo.findAll();
    }
}
