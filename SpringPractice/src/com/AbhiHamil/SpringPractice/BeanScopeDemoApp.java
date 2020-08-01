package com.AbhiHamil.SpringPractice;

import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load application context /spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve bean from application/spring container
		Coach theCoach= context.getBean("TrackCoachId", Coach.class);
		
		Coach theAlphaCoach=context.getBean("TrackCoachId", Coach.class);

		// check whether both the objects points to same location or not?
		
		boolean result=(theCoach==theAlphaCoach);
		
		System.out.println("pointing to the same obj? "+result);
		// prints the address to check both the objects points to same location or not?
		System.out.println("Memory location of theCoach: "+theCoach);
		
		System.out.println("Memory location of theAlphaCoach: "+theAlphaCoach);
		
		// close the context
		
		context.close();
	}

}
