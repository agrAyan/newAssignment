package com.inter.extend;

public class AdvCalculator extends BasicCalculator implements Scientific {

	@Override
	public void square(int a) {
		System.out.println("Square "+a*a);
	}

}
