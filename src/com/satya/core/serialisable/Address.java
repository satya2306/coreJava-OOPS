package com.satya.core.serialisable;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(String city) {
		super();
		
		if(city.equals("Hyderabad")){
		this.state = "Telengana";
		}
	}
	
}
