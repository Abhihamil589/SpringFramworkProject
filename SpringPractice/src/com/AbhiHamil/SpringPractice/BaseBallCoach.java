package com.AbhiHamil.SpringPractice;

public class BaseBallCoach implements Coach{

	// define the private field for the dependency
	private FortuneService fortuneService;
	
	
	// define the constructor for the dependency
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	public BaseBallCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {		
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
}
