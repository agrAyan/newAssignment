package com.inter.advanced;

public abstract class Employee implements BonusCalaculator{

	String name;
	double salary;

	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	void getDetails(){
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}


	
}
