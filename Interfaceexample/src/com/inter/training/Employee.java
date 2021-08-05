package com.inter.training;

public class Employee extends Details {

	public Employee(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void joincourse() {
		System.out.println("overriiden course name is java interface");
		
	}

	@Override
	public void shoeSports() {
		System.out.println(" overridden sport name is cricket");
		
	}
	void getDeatils() {
		System.out.println(" emp name is"+ name);
		System.out.println("emp city is"+ city);
	}
}
