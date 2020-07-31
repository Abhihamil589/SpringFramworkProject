package com.AbhiHamil.SpringPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		CricketCoach theCoach =context.getBean("CricketCoachId",CricketCoach.class);
		
		//call the method on the beans
		System.out.println(theCoach.getDailyWorkout());
		
		// calling new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		// close the context
		context.close();

	}

}
