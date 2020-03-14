package com.newVersion.example.entities;

public class CoronaVirusData {

	private String country;
	private String state;
	private int total_Confirmed_Cases;
	private int total_Deaths;
	private int total_Recovered;
	

	public CoronaVirusData(String country, String state, int total_Confirmed_Cases, int total_Deaths,
			int total_Recovered) {
		super();
		this.country = country;
		this.state = state;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
	
	public void setTotal_Recovered(int total_Recovered) {
		this.total_Recovered = total_Recovered;
	}
	public int getTotal_Recovered() {
		return total_Recovered;
	}
    
	@Override
	public String toString() {
		return country+"\t----------->"+state+"\t------------>"+total_Confirmed_Cases+
				"\t------------>"+total_Deaths+"------------->"+total_Recovered;
	}
}
