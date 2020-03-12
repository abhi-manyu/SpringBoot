package com.employeeManagement.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@XmlRootElement
public class Employee
{
    @Id
    private int empId;
    private String empName;
    private String address;
    private String department;
    private int age;
    private char gender;
    @Transient
    private String status;
    
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String address, 
			String department, int age, char gender,String status) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.department = department;
		this.age = age;
		this.gender = gender;
		this.status=status;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
    
	@JsonSerialize
	@JsonDeserialize
	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonSerialize
	@JsonDeserialize
	public String getStatus() {
		return status;
	}
    
    
}
