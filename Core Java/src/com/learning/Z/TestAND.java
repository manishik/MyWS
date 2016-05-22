package com.learning.Z;

public class TestAND {

	public static void main(String[] args) {
		/*
		 * & evaluates both sides of the operation. && evaluates the left side
		 * of the operation, if it's true, it continues and evaluates the right
		 * side.
		 */

		//& is bitwise. && is logical.
		
		if ((isItSmall(7)) && (isItSmall(3))) {
			System.out.println("Result is true");
		}

		if ((isItSmall(3)) & (isItSmall(9))) {
			System.out.println("Result is false");
		}

		int num = 15;

		if (num < 20 && num > 7) { // if both are true then print
			System.out.println("Both condition met..");
		}

		/*
		 * if (num < 10 & num > 20) { System.out.println("&"); }
		 */
	}

	public static boolean isItSmall(int i) {
		if (i < 5) {
			System.out.println(i + " < 5");
			return true;
		} else {
			System.out.println(i + " >= 5");
			return false;
		}
	}
}
