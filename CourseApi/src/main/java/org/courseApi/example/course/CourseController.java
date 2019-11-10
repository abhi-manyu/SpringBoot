package org.courseApi.example.course;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.courseApi.example.student.Student;
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
@RequestMapping("/courses")
public class CourseController
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Course> viewCourses()
    {
    	return courseService.getAllCourses();
    }
	@GetMapping(value="/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Course viewCourse(@PathVariable int id)
    {
    	return courseService.getCourse(id);
    }
	
	@PostMapping
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	//accepts both xml format and json formated request body and then convert to Course type
    public List<Course> addCourse(@RequestBody Course course)
    {
    	return courseService.addCourse(course);
    }
	
	@PutMapping(value="/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	//accepts both xml format and json formated request body and then convert to Course type
	public Course updateCourse(@RequestBody Course course, @PathVariable int id)
	{
		return courseService.updateCourse(id, course);
	}
	
	@DeleteMapping(value="/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Course> deleteCourse(@PathVariable int id)
	{
		return courseService.deleteCourse(id);
	}
	
	@GetMapping(value="/{id}/students")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Student> getAllStudents(@PathVariable int id)
	{
		return courseService.getAllStudents(id);
	}

	
	@GetMapping(value="/{cid}/students/{sid}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student get_a_Student(@PathVariable int cid , @PathVariable int sid)
	{
		return courseService.get_a_Student(cid, sid);
	}
	
	@PostMapping(value = "/{cid}/students")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Student> add_a_Student(@PathVariable int cid,@RequestBody Student st)
	{
		return courseService.add_a_Student(cid, st);
	}
	
}
