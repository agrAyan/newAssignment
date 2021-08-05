package com.inter.training;

public abstract class Details implements Training, Sports {

	
	public Details(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	String name;
	String city;
	
	
	void getDeatils() {
		System.out.println("deatils class name is"+ name);
		System.out.println("details class city is"+ city);
	}
	

}
