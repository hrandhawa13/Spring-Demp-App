package com.springDemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortune;
	
	public BaseballCoach(FortuneService fortune) {
		this.fortune = fortune;
	}
	@Override
	public String getDailyWorkout() {
		return "spend 30 minute on batting practise";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortuneService();
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}

}
