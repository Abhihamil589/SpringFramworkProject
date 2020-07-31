package com.AbhiHamil.SpringPractice;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach TrackCoach=new TrackCoach();
		Coach BaseBallCoach=new BaseBallCoach();
		//use the object
		System.out.println(TrackCoach.getDailyWorkout());
		System.out.println(BaseBallCoach.getDailyWorkout());
	}

}
