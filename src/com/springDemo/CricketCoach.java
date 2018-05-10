package com.springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortune;
	@Override
	public String getDailyWorkout() {
		return "practise fielding today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "cricket coach says " + fortune.getFortuneService();
	}
	public void setFortuneService(FortuneService fortune) {
		this.fortune = fortune;
	}

}
