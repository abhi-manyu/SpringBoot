package org.courseApi.example.course;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.courseApi.example.student.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping(value="/courses")
    public List<Course> viewCourses()
    {
    	return courseService.getAllCourses();
    }
	@GetMapping(value="/courses/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Course viewCourse(@PathVariable int id)
    {
    	return courseService.getCourse(id);
    }
	
	@PostMapping(value="/courses")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	//accepts both xml format and json formated request body and then convert to Course type
    public List<Course> addCourse(@RequestBody Course course)
    {
    	return courseService.addCourse(course);
    }
	
	@PutMapping(value="/courses/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	//accepts both xml format and json formated request body and then convert to Course type
	public Course updateCourse(@RequestBody Course course, @PathVariable int id)
	{
		return courseService.updateCourse(id, course);
	}
	
	@DeleteMapping(value="/courses/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Course> deleteCourse(@PathVariable int id)
	{
		return courseService.deleteCourse(id);
	}
	
	@RequestMapping("/courses/{cId}/students")
	public StudentController getStudentController()
	{
		return new StudentController();
	}

	
	
	
	
	
}
