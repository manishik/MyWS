package com.learning.BreakContinue;

public class MyExample {

	public static void main(String[] args) {
		MyExample example = new MyExample();
		example.example1();
		// example.example2();
	}

	void example1() {
		System.out.println("starting loop:");
		for (int n = 0; n < 7; ++n) {
			System.out.println("in loop: " + n);
			if (n == 2) {
				continue;
			}
			System.out.println("   survived first guard");
			if (n == 4) {
				break;
			}
			System.out.println("   survived second guard");
			// continue at head of loop
		}
		// break out of loop
		System.out.println("end of loop or exit via break");
	}

	void example2() {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.print(i + "\t");
		}
	}

}
