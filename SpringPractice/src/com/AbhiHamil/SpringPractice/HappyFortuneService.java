package com.AbhiHamil.SpringPractice;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today's your Lucky day!";
	}
	public String getSadFortune() {
		// TODO Auto-generated method stub
		return "It's your bad luck!";
	}

}
