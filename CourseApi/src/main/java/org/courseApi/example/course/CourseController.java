package org.courseApi.example.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/courses")
    public List<Course> viewCourses()
    {
    	return courseService.getAllCourses();
    }
	@RequestMapping(value="/courses/{id}")
    public Course viewCourse(@PathVariable int id)
    {
    	return courseService.getCourse(id);
    }
	
	@RequestMapping(value="/courses",method=RequestMethod.POST)
    public List<Course> addCourse(@RequestBody Course course)
    {
    	return courseService.addCourse(course);
    }
	
	@RequestMapping(value="/courses/{id}",method=RequestMethod.PUT)
	public Course updateCourse(@RequestBody Course course, @PathVariable int id)
	{
		return courseService.updateCourse(id, course);
	}
	
	@RequestMapping(value="/courses/{id}",method=RequestMethod.DELETE)
	public List<Course> deleteCourse(@PathVariable int id)
	{
		return courseService.deleteCourse(id);
	}
}
