package com.inter.def;

public interface BonusCalculator {
	
	void  calcBonus(int x);
	default void greetMessage(){
		System.out.println("have a good day");
	}
	
}
