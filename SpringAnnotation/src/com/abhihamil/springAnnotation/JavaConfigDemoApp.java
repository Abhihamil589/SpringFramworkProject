package com.abhihamil.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve beans from the container
		
		SwimCoach theCoach=context.getBean("swinCoach", SwimCoach.class);
		
		// call methods on the container
		
			System.out.println(theCoach.getDailyWorkOut());
			System.out.println(theCoach.getDailyFortune());
			System.out.println(theCoach.getEmail());
			System.out.println(theCoach.getName());
		// close the context
		
		context.close();

	}

}
