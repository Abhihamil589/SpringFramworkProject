package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;


public class Student {
	private String firstName,lastName,country,favLang,os;
	LinkedHashMap<String, String> countries=new  LinkedHashMap<String, String>();

	public Student() {
		countries.put("IND", "Indian");
		countries.put("US", "United states of America");
		countries.put("Br", "Brazil");
		countries.put("GR", "Germany");
		countries.put("CAN", "Canada");
	}
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFavLang() {
		return favLang;
	}
	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}

}
