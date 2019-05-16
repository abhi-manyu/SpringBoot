package org.courseApi.example.student;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/")
public class StudentController
{
    @Autowired
    StudentService studentService;
    
    @GET
    //@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Student> getAllStudentsOfaCourse(@PathParam("cId") int cId)
	{
		return studentService.get_All_Student_From_a_Course(cId);
	}
    
    
}
