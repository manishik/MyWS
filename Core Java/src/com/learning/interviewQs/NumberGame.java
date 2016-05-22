package com.learning.interviewQs;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Scanner;

public class NumberGame {

	public static final int LOWER = 0, UPPER = 1000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please let us know if you're ready for Number-Guessing game");
		System.out.println("Type 'r' if ready");
		String ready = sc.nextLine();

		if (ready.equalsIgnoreCase("r")) {
			System.out.printf("Choose a number from %d (inclusive) to %d (exclusive) and I will guess it\n"
					+ "After each guess, please respond with Higher(h), Lower(l) and Yes(y) or End(e) depending\n"
					+ "on if my guess was too high, too low, or correct.\n", LOWER, UPPER);
			int result = Collections.binarySearch(new AbstractList<Integer>() {
				private final Scanner in = new Scanner(System.in);

				public int size() {
					return UPPER - LOWER;
				}

				//Returns the element at the specified position in this list.
				public Integer get(int i) {
					System.out.println("i = "+i);
					System.out.printf("My guess is: %d. Is it too high, too low, or correct? (H/L/Y or E) ", LOWER + i);
					String string = in.nextLine();

					if (string.equalsIgnoreCase("h") || string.equalsIgnoreCase("l") || string.equalsIgnoreCase("y")
							|| string.equalsIgnoreCase("e")) {
						//assert string.length() > 0;
						switch (Character.toLowerCase(string.charAt(0))) {
						case 'l':
							return -1;
						case 'h':
							return 1;
						case 'y':
							return 0;
						case 'e':
							return 0;
						}
					} else {
						System.out.println("Invalid input, bye bye...");
						System.exit(0);
					}
					return -1;
				}
			}, 0);

			System.out.println("Result = "+result);
			if (result < 0) {
				System.out.println("Somewhere you miss judged high & low and now it's impossible.");
			} else {
				System.out.printf("Your number is %d.\n", result);
			}
		} else {
			System.out.println("Looks like you're not game, bye for now..");
		}
	}
}
