package com.javaInterview.topQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	static long i1 = 0, i2 = 1, i3 = 1;

	public static void main(String[] args) throws IOException {
		long number;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number\n");
		number = Long.parseLong(br.readLine());
		 fibo(number); // using recursion
		// fibonacci(number); // using iterative

	}

	static long fibo(long number) { // using recursion
		if (number >= i3) {
			System.out.print(i3 + "   ");
			i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
			return (fibo(number));
		} else {
			return (1);
		}
	}

	static void fibonacci(long number) { // using iterative
		System.out.println();
		System.out.print(i1 + " " + i2 + "  ");
		for (long i = 0; i <= number; i++) {
			i = i1 + i2;
			System.out.print(i + "  ");
			i1 = i2;
			i2 = i;
		}
	}

}
