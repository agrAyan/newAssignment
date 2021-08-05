package com.inter.basic;

public class Eagle extends Bird implements Flyable {

	public Eagle(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(name +" Flies very high");
	}
	
	

}
