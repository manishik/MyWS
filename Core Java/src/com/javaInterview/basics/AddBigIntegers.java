package com.javaInterview.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class AddBigIntegers {

	public static void main(String[] args) {
		System.out.println("Input a number");
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		System.out.println("Input another number");
		BigInteger b = scan.nextBigInteger();;
		BigInteger sum = a.add(b);
		System.out.println("Sum of 2 given number = " + sum);
	}

}
