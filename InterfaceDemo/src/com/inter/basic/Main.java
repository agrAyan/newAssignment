package com.inter.basic;

public class Main {


	public static void main(String[] args) {

		Bird bird = new Eagle("Eagle");
		bird.printName();
		
		Flyable ref =(Flyable) bird;
		ref.fly();
		
		bird = new Parrot("Parrot");
		bird.printName();
		
		ref =(Flyable) bird;
		ref.fly();
		
		Talkable tk = (Talkable)bird;
		tk.talk();
		
		Parrot par = (Parrot)bird;
		par.makeSound();
		
		
	}

}
