package com.newVersion.example.entities;

public class CoronaVirusData {

	private String country;
	private int total_Confirmed_Cases;
	private int total_Deaths;
	private int activeCase;
	private int total_Recovered;
	

	public CoronaVirusData(String country,int total_Confirmed_Cases, int total_Deaths,
			int activeCase, int total_Recovered) {
		super();
		this.country = country;
		this.total_Confirmed_Cases = total_Confirmed_Cases;
		this.total_Deaths = total_Deaths;
		this.activeCase=activeCase;
		this.total_Recovered = total_Recovered;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setTotal_Confirmed_Cases(int total_Confirmed_Cases) {
		this.total_Confirmed_Cases = total_Confirmed_Cases;
	}
	public int getTotal_Confirmed_Cases() {
		return total_Confirmed_Cases;
	}
	
	public void setTotal_Deaths(int total_Deaths) {
		this.total_Deaths = total_Deaths;
	}
	public int getTotal_Deaths() {
		return total_Deaths;
	}
	
	public void setActiveCase(int activeCase) {
		this.activeCase = activeCase;
	}
	
	public int getActiveCase() {
		return activeCase;
	}
	
	public void setTotal_Recovered(int total_Recovered) {
		this.total_Recovered = total_Recovered;
	}
	public int getTotal_Recovered() {
		return total_Recovered;
	}
    
	@Override
	public String toString() {
		return "["+country+"\t"+total_Confirmed_Cases+"\t"+total_Deaths+
				"\t"+total_Recovered+"]";
	}
}
