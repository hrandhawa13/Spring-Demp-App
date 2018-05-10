package com.springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortune;
	private String email;
	private String team;
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
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
}
