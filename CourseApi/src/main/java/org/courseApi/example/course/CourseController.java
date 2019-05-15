package org.courseApi.example.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public Course viewCourse(@PathVariable int id)
    {
    	return courseService.getCourse(id);
    }
	
	@PostMapping(value="/courses")
    public List<Course> addCourse(@RequestBody Course course)
    {
    	return courseService.addCourse(course);
    }
	
	@PutMapping(value="/courses/{id}")
	public Course updateCourse(@RequestBody Course course, @PathVariable int id)
	{
		return courseService.updateCourse(id, course);
	}
	
	@DeleteMapping(value="/courses/{id}")
	public List<Course> deleteCourse(@PathVariable int id)
	{
		return courseService.deleteCourse(id);
	}
}
