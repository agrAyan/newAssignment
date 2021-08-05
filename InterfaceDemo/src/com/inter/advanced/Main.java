package com.inter.advanced;

public class Main {
	public static void main(String[] args) {

		Employee manager = new Manager("Ram",9000);
		manager.getDetails();
		
		Recreation rec = (Recreation)manager;
		rec.musicClub();
		rec.theatreClub();
		System.out.println(Recreation.PROVIDER);
		
		Manager mr = (Manager)manager;
		mr.ownMeth();
		
		Employee programmer = new Programmer("John",3000);
		programmer.getDetails();
		
		rec = (Recreation)programmer;
		rec.musicClub();
		rec.theatreClub();
		
		Gamer gamer = (Gamer)programmer;
		gamer.outdoorGames();
		gamer.indoorGames();
		
		BonusCalaculator bonus = (BonusCalaculator)programmer;
		bonus.calculateBonus();
		
		
		
	}

}
