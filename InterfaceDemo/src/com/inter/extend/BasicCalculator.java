package com.inter.extend;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("Sum "+(a+b));
	}

	@Override
	public void subtract(int a, int b) {
		System.out.println("Diff "+(a-b));
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("Product "+(a*b));
	}

	@Override
	public void divide(int a, int b) {
		System.out.println("Result "+(a/b));
	}


}
