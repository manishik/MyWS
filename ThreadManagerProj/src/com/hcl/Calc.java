//Example for Strategy Pattern in Java
package com.hcl;

public class Calc {
	public static void main(String[] args) {
		CalculatorContext calcContext;

		calcContext = new CalculatorContext(new Add());
		int resultA = calcContext.genericMethod(10, 20);
		System.out.println("resultA = " + resultA);

		calcContext = new CalculatorContext(new Sub());
		int resultB = calcContext.genericMethod(10, 20);
		System.out.println("resultB = " + resultB);

		calcContext = new CalculatorContext(new Multiply());
		int resultC = calcContext.genericMethod(10, 20);
		System.out.println("resultC = " + resultC);
		
		
	}
}

interface Calculator {
	int genericMethod(int a, int b);
}

class Add implements Calculator {
	public int genericMethod(int a, int b) {
		return a + b;
	}
}

class Sub implements Calculator {
	public int genericMethod(int a, int b) {
		return a - b;
	}
}

class Multiply implements Calculator {
	public int genericMethod(int a, int b) {
		return a * b;
	}
}

class CalculatorContext implements Calculator {
	
	private Calculator calc; 

	public CalculatorContext(Calculator calci) {
		this.calc = calci;
	}

	public int genericMethod(int a, int b) {
		return calc.genericMethod(a, b);
	}

}