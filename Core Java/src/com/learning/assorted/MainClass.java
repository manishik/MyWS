package com.learning.assorted;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		int i = GetInteger();
		System.out.println("You entered " + i);
	}

	public static int GetInteger() {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.out.print("That's not " + "an integer. Try again: ");
			}
		}
	}
}
