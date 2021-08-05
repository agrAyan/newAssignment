package com.inter.basic;

public class Parrot extends Bird implements Flyable, Talkable {

	public Parrot(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println(name+" repeats what you say");
	}

	@Override
	public void fly() {
		System.out.println(name+" flies low ");
	}
	
	void makeSound(){
		System.out.println(name+" sounds as kiki");
		
	}

}
