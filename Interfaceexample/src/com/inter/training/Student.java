package com.inter.training;

public class Student extends Details implements Hobbies {

	public Student(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void joincourse() {
		System.out.println("course is java and student class");

	}

	@Override
	public void shoeSports() {
		System.out.println("student class name of sport is cricket");

	}

	@Override
	public void showHobbies() {
		// TODO Auto-generated method stub

	}
	public void ownMethod() {
		System.out.println("own method of student");
	}

}
