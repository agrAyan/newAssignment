package com.inter.advanced;

public class Manager extends Employee implements Recreation{

	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void musicClub() {
		System.out.println("Weekend music party");
		
	}

	@Override
	public void theatreClub() {
		System.out.println("standup comedy weekeend");
	}

	@Override
	public void calculateBonus() {
		System.out.println("mg bonus");
	}
	
	void ownMeth(){
			System.out.println("mgr method");
		}

}
