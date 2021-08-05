package com.inter.def;

public interface IncCalculator {
	void  calcBonus(int x);
	default void greetMessage(){
		System.out.println("Good bye");
	}

}
