package com.inter.def;

public class Manager implements BonusCalculator,IncCalculator{

	@Override
	public void calcBonus(int x) {
		System.out.println("bonus "+x);
	}

	@Override
	public void greetMessage() {
		System.out.println("in manager");
		BonusCalculator.super.greetMessage();
		IncCalculator.super.greetMessage();
	}
	

	
}
