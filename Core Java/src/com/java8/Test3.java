package com.java8;

//Java program to demonstrate lambda expressions to implement 
//a user defined functional interface. 

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class Test3 {
	public static void main(String args[]) {
		int a = 5;

		// lambda expression to define the calculate method
		Square square = (int b) -> b * b;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = square.calculate(a);
		System.out.println(ans);
	}
}
