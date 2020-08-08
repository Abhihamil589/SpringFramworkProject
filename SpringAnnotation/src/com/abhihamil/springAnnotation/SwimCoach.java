package com.abhihamil.springAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService FortuneService;
	@Value("${foo.name}")
	public String name;
	@Value("${foo.email}")
	public String email;
	public SwimCoach(FortuneService theFortuneService){
		FortuneService=theFortuneService;
		
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Swim 3000m as the warmUp";
	}

	@Override
	public String getDailyFortune() {
		
		return FortuneService.getFortune();
	}

}
