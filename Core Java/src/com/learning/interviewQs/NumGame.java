package com.learning.interviewQs;

import java.util.Scanner;

public class NumGame {

	public static void main(String[] args) {

		int low = 1, high = 100, mid;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a number in your mind between " + low + " and " + high);
		System.out.println("I will try guessing it.");
		System.out.println("Are you ready?");
		String ready = scanner.nextLine();
		if (ready.equalsIgnoreCase("ready")) {
			do {
				mid = (low + high) / 2;
				System.out.println("Is your number " + mid + "?");
				String numChoice = scanner.nextLine();
				if (numChoice.equalsIgnoreCase("higher")) {
					low = mid;
				}
				if (numChoice.equalsIgnoreCase("lower")) {
					high = mid;
				}
				if (numChoice.equalsIgnoreCase("yes") || numChoice.equalsIgnoreCase("end")) {
					System.exit(0);
				}
			} while (low == mid || high == mid);
		} else {
			System.out.println("Bye bye..");
		}
	}
}
