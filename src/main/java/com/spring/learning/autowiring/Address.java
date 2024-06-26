package com.spring.learning.autowiring;

public class Address {
		
	private String city;
	private String state;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	
}
