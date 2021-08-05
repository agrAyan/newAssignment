package com.inter.training;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports sport = new Employee("ram", "sagar");
		sport.shoeSports();
		sport.printName();
		Training t= (Training) sport;
		t.joincourse();
		Details d= (Details) t;
		d.getDeatils();
		Employee e= (Employee) sport;
		e.getDeatils();
		System.out.println("---------------------------------------");
		

		
		Training tra = new Student("Ayan","Delhi");
		tra.joincourse();
		Sports sports= (Sports) t;
		sports.shoeSports();
		sports.printName();
		Hobbies hoobies= (Hobbies) tra;
		hoobies.showHobbies();
		Student student = (Student) hoobies;
		student.ownMethod();

	}

}
