package com.adhoc;

import java.util.List;

public class Address {
	public String street;
	public String city;
	public String state;
	public String zipCode;
	public List<String> phno;

//	public Address(String street, String city, String state, String zipCode) {
//		this.street = street;
//		this.city = city;
//		this.state = state;
//		this.zipCode = zipCode;
//	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
	public List<String> getPhno() {
		return phno;
	}

	public void setPhno(List<String> phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumbers="
				+ phno + "]";
	}

	

	
	
}
