package com.AbhiHamil.SpringPractice;

public class TrackCoach implements Coach {

	private FortuneService fortuneSerive;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 mins on Tracking";
	}

	public TrackCoach(FortuneService fortuneSerive) {
		this.fortuneSerive = fortuneSerive;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Well done.Keep tracking";
	}

	// init method

	public void doMyStartUpStuff() {

		System.out.println("hi! hello init method");

	}

	// destroy method 
	public void doMyCleanUpStuff() {

		System.out.println("hi! hello destroy method ");

	}
}
