package com.example.jpql.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    
	@Id
	@Column(name="member_Id")
	private int id;
	@Column(name="member_Name")
	private String name;
	@Column(name="member_Address")
	private String address;
	@Column(name="member_age")
	private int age;
	@Column(name="member_martalStatus")
	private String status;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address, int age, String status) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
