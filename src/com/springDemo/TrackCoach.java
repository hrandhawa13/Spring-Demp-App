package com.springDemo;

public class TrackCoach implements Coach {
	private FortuneService fortune;
	
	public TrackCoach(FortuneService fortune) {
		this.fortune = fortune;
	}
	@Override
	public String getDailyWorkout() {
		return "Run hard 5k everyday";
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
