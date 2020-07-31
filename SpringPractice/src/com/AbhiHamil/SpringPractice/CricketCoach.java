package com.AbhiHamil.SpringPractice;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String team;
	private String emailAddress;
	
	public CricketCoach() {
	System.out.println("No arg/default constructor called");
	}
	@Override
	public String getDailyWorkout() {
		return "Bat for atleast 15mins every day";
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("method of cricketCouch Class - setFortuneService called");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		System.out.println("method of cricketCouch Class - getDailyFortune called");
		return fortuneService.getFortune();
	}
	

	public String getTeam() {
		System.out.println("method of cricketCouch Class - getTeam called");
		return team;
	}

	public void setTeam(String team) {
		System.out.println("method of cricketCouch Class - setTeam called");
		this.team = team;
	}

	public String getEmailAddress() {
		System.out.println("method of cricketCouch Class - getEmailAddess called");
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("method of cricketCouch Class - setEmailAddess called");
		this.emailAddress = emailAddress;
	}



}
