package com.inter.advanced;

public class Programmer extends Employee implements Recreation, Gamer {

	public Programmer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void outdoorGames() {
		System.out.println("Cricket and Tennis");
	}

	@Override
	public void indoorGames() {
		System.out.println("Chess and Tabletennis");
	}

	@Override
	public void musicClub() {
		System.out.println("Music night weekday");
	}

	@Override
	public void theatreClub() {
		System.out.println("standup comedy weekeend");
	}

	@Override
	public void calculateBonus() {
		System.out.println("pr bonus");
	}

}
