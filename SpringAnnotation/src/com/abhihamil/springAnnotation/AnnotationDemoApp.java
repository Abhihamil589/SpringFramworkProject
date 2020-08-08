package com.abhihamil.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve beans from the container
		
		Coach theCoach=context.getBean("tennisCoach", TennisCoach.class);
		
		// call methods on the container
		
			System.out.println(theCoach.getDailyWorkOut());
			System.out.println(theCoach.getDailyFortune());
		
		// close the context
		
		context.close();

	}

}
