package com.satya.core.serialisable;

import java.io.Serializable;

public class Man extends Human implements Serializable {

	 public Man() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;
	 private String address;
	 
	 private Address state;
	 

	 public Address getState() {
		return state;
	}

	public void setState(Address state) {
		this.state = state;
	}

	Man(String gender, String color, String name, String address) {
		 
		 super(gender, color);
		 Address a=new Address(address);
		 this.state=a;
		 
	 
	  this.name = name;
	  this.address = address;
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

	}
