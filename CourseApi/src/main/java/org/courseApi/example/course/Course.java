package org.courseApi.example.course;


public class Course
{
   private int courseId;
   private String courseName;
   private String courseDesc;
   
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
   
}
