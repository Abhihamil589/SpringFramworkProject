package com.abhihamil.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;

	}
	 */
	@Override
	public String getDailyWorkOut() {
		return "Work on your backHand volley";
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
