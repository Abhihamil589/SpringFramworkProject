package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {

	
	public String firstName; 
	@NonNull()
	@Size(min=1 ,message = "should be mini greater than 1")
	public String lastName;
	@CourseCode(value = "SSDN",message = "Must start with SSDN")
	public String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firtName) {
		this.firstName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
