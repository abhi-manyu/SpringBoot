package com.demo.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String studentAddress;
	private double mark;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentAddress, double mark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.mark = mark;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "\n student id : "+studentId+"\n student name : "+studentName
				+"\n student address : "+studentAddress
				+"\n student marks : "+mark;
	}
	
	
	
	
}
