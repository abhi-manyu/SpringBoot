package org.courseApi.example.student;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
    @Autowired
    StudentService studentService;
    
    @GetMapping("/")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Student> getAllStudentsOfaCourse(@PathVariable int cId)
	{
    	System.out.println("recieved  path param as : "+cId);
		return studentService.get_All_Student_From_a_Course(cId);
	}
    
    
    @GetMapping(value="/courses/{cId}/students/{sId}")
	public Student get_a_Student_From_a_Course(@PathVariable int cId,
			                @PathVariable int sId)
	{
		return studentService.get_a_Stuent_From_a_Course(cId, sId);
	}
	
	@PostMapping(value="/courses/{cId}/students")
	public List<Student> add_Student_To_a_Course(@RequestBody Student student,@PathVariable int cId)
	{
		return studentService.addStudentTo_a_Course(cId, student);
	}
    
    
    
    
    
    
    
    
}
