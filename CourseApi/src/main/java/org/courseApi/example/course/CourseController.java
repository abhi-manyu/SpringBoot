package org.courseApi.example.course;

import java.util.List;

import javax.ws.rs.Path;

import org.courseApi.example.student.Student;
import org.courseApi.example.student.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Path(value="/courses")
public class CourseController
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping
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
	//accepts both xml format and json formated request body and then convert to Course type
    public List<Course> addCourse(@RequestBody Course course)
    {
    	return courseService.addCourse(course);
    }
	
	@PutMapping(value="/courses/{id}")
	//accepts both xml format and json formated request body and then convert to Course type
	public Course updateCourse(@RequestBody Course course, @PathVariable int id)
	{
		return courseService.updateCourse(id, course);
	}
	
	@DeleteMapping(value="/courses/{id}")
	public List<Course> deleteCourse(@PathVariable int id)
	{
		return courseService.deleteCourse(id);
	}
	
	
	
	@Path(value="/courses/{cId}/students")
	public StudentController getStudentController()
	{
		return new StudentController();
	}

	
	
	
	
	
	
	
	
	@GetMapping(value="/courses/{cId}/students/{sId}")
	public Student get_a_Student_From_a_Course(@PathVariable int cId,
			                @PathVariable int sId)
	{
		return courseService.get_a_Stuent_From_a_Course(cId, sId);
	}
	
	@PostMapping(value="/courses/{cId}/students")
	public List<Student> add_Student_To_a_Course(@RequestBody Student student,@PathVariable int cId)
	{
		return courseService.addStudentTo_a_Course(cId, student);
	}
	
	
	
	
}
