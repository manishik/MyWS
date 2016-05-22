package com.javaInterview.basics;

/* Program for Factorial, Fibonacci and GCD */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FFG {

	static long i1 = 0, i2 = 1, i3 = 1;

	public static void main(String[] args) throws IOException {

		long a, b, g, n1, f1 = 0;
		int i1;

		FFG ffgObj = new FFG();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter u'r choice for finding the following\n");
		System.out.println("Type '1' for  Factorial\n");
		System.out.println("Type '2' for Fibonacci\n");
		System.out.println("Type '3' for GCD\n");
		i1 = Integer.parseInt(br.readLine());
		switch (i1) {
		default:
			System.out.println("Invalid Choice\n");
			break;
		case 1:
			System.out.println("Enter a number\n");
			n1 = Integer.parseInt(br.readLine());
			if (n1 < 0) {
				System.out.println("Factorial not defined for -ve numbers");
				System.exit(0);
			} else {
				System.out.println("Factorial of the given number = "
						+ ffgObj.fact(n1));
			}
			break;
		case 2:
			System.out.println("Enter the Maximum Range\n");
			n1 = Integer.parseInt(br.readLine());
			System.out.println("The Fibonacci Series is\n");
			System.out.println(f1);
			ffgObj.fibo(n1);
			System.exit(0);
		case 3:
			System.out.println("Enter two numbers\n");
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			g = ffgObj.gcd(a, b);
			System.out.println("The GCD of the number is = " + g);
			break;
		}
	}

	long fact(long n) {
		if (n == 0)
			return (1);
		else
			return (n * fact(n - 1));
	}

	long fibo(long n) { //using recursion 
		if (n >= i3) {
			System.out.println(i3);
			i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
			return (fibo(n));
		} else {
			return (1);
		}
	}

	long gcd(long a, long b) {
		long rem;
		if (b == 0) {
			return (a);
		} else {
			rem = a % b;
		}
		return (gcd(b, rem));
	}

}
