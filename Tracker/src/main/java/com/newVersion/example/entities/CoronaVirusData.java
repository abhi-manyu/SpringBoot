package com.newVersion.example.entities;

public class CoronaVirusData {

	private String country;
	private double total_Confirmed_Cases;
	private double total_Deaths;
	private double total_Recovered;
	

	public CoronaVirusData(String country,double total_Confirmed_Cases, double total_Deaths,
			double total_Recovered) {
		super();
		this.country = country;
		this.total_Confirmed_Cases = total_Confirmed_Cases;
		this.total_Deaths = total_Deaths;
		this.total_Recovered = total_Recovered;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setTotal_Confirmed_Cases(double total_Confirmed_Cases) {
		this.total_Confirmed_Cases = total_Confirmed_Cases;
	}
	public double getTotal_Confirmed_Cases() {
		return total_Confirmed_Cases;
	}
	
	public void setTotal_Deaths(double total_Deaths) {
		this.total_Deaths = total_Deaths;
	}
	public double getTotal_Deaths() {
		return total_Deaths;
	}
	
	public void setTotal_Recovered(double total_Recovered) {
		this.total_Recovered = total_Recovered;
	}
	public double getTotal_Recovered() {
		return total_Recovered;
	}
    
	@Override
	public String toString() {
		return "["+country+"\t"+total_Confirmed_Cases+"\t"+total_Deaths+
				"\t"+total_Recovered+"]";
	}
}
