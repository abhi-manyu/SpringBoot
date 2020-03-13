package com.newVersion.example.entities;

public class CoronaVirusData {

	private String country;
	private String state;
	private int total_as_of_Now;
	

	public CoronaVirusData(String country, String state, int total_as_of_Now) {
		super();
		this.country = country;
		this.state = state;
		this.total_as_of_Now = total_as_of_Now;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTotal_as_of_Now() {
		return total_as_of_Now;
	}

	public void setTotal_as_of_Now(int total_as_of_Now) {
		this.total_as_of_Now = total_as_of_Now;
	}
	
	@Override
	public String toString() {
		return country+"\t----------->"+state+"\t------------>"+total_as_of_Now;
	}
}
