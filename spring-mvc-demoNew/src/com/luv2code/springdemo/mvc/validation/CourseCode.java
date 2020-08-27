package com.luv2code.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface CourseCode {
	
	// define default course code
	public String value() default "SSDN";
	
	// define default error message
	public String message() default "Must start with SSDN";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
