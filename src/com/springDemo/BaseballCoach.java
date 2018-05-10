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

}
