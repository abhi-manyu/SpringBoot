package org.courseApi.example.course;

import java.util.List;

//import org.courseApi.example.student.Student;

public class Course
{
   private int courseId;
   private String courseName;
   private String courseDesc;
   //private List<Student> students;
   
   public Course() {
	// TODO Auto-generated constructor stub
    }

public Course(int courseId, String courseName, String courseDesc) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.courseDesc = courseDesc;
}
   public void setCourseId(int courseId) {
	this.courseId = courseId;
}
   public int getCourseId() {
	return courseId;
}
   public void setCourseName(String courseName) {
	this.courseName = courseName;
}
   public String getCourseName() {
	return courseName;
}
   public void setCourseDesc(String courseDesc) {
	this.courseDesc = courseDesc;
}
   public String getCourseDesc() {
	return courseDesc;
}
  /* public void setStudents(List<Student> students) {
	this.students = students;
}
   public List<Student> getStudents() {
	return students;
}*/
}
