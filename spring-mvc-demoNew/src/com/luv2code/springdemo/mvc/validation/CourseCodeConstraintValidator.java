package com.luv2code.springdemo.mvc.validation;

import javax.swing.text.StyledEditorKit.BoldAction;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	public String courseCodePreFixValue;
	public  void initialize(CourseCode theCourseCode) {

		courseCodePreFixValue=theCourseCode.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

		Boolean result=courseCodePreFixValue.startsWith(theCode);	
		if(result!=null)
			return result;
		else
			return true;
			
	}

}
