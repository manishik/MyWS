package com.learning.Z;

class TestOR {
	public static void main(String[] args) {
		if ((isItSmall(3)) || (isItSmall(7))) {
			System.out.println("Result is true");
		}
		if ((isItSmall(6)) || (isItSmall(9))) {
			System.out.println("Result is false");
		}
	}

	public static boolean isItSmall(int i) {
		if (i < 5) {
			System.out.println("i < 5");
			return true;
		} else {
			System.out.println("i >= 5");
			return false;
		}
	}
}
