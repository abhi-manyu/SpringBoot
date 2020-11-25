package com.demo.example.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Roomate {

	@Id
	private int roomateId;
	private String RoomateName;
	private String RoomateAddress;
	private double age;
	
	public Roomate() {
		// TODO Auto-generated constructor stub
	}

	public Roomate(int studentId, String studentName, String studentAddress, double mark) {
		super();
		this.roomateId = studentId;
		this.RoomateName = studentName;
		this.RoomateAddress = studentAddress;
		this.age = mark;
	}

	
	
	public int getRoomateId() {
		return roomateId;
	}

	public void setRoomateId(int roomateId) {
		this.roomateId = roomateId;
	}

	public String getRoomateName() {
		return RoomateName;
	}

	public void setRoomateName(String roomateName) {
		RoomateName = roomateName;
	}

	public String getRoomateAddress() {
		return RoomateAddress;
	}

	public void setRoomateAddress(String roomateAddress) {
		RoomateAddress = roomateAddress;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "\n roommate id : " + roomateId + "\n roommate name : " + RoomateName + 
				"\n roommate address : "+ RoomateAddress + 
				"\n roommate age : " + age;
	}
	
	
	
	
}
