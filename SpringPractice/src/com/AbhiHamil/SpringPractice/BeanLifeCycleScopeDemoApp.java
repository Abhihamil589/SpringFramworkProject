package com.AbhiHamil.SpringPractice;

import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleScopeDemoApp {

	public static void main(String[] args) {
		
		// load application context /spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycleScope-applicationContext.xml");
		
		// Retrieve bean from application/spring container
		Coach theCoach= context.getBean("TrackCoachId", Coach.class);
				
		
		//calling methods on the coach obj
		
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
