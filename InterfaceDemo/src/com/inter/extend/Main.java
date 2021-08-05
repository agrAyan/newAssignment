package com.inter.extend;

public class Main {

	public static void main(String[] args) {

		Calculator ref = new BasicCalculator();
		ref.add(10,20);
		ref.subtract(210,20);
		ref.multiply(10,20);
		ref.divide(10,2);
		
		System.out.println();
		ref = new AdvCalculator();
		ref.add(10,20);
		ref.subtract(210,20);
		ref.multiply(10,20);
		ref.divide(10,2);
		
		
		System.out.println();
		Scientific scientific = new AdvCalculator();
		scientific.add(100,200);
		scientific.subtract(2100,20);
		scientific.multiply(100,200);
		scientific.divide(100,2);
		scientific.square(25);
		
		
	}

}
