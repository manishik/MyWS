package com.learning.Exceptions;

public class P1 {

	public static void main(String[] args) {

		try {
			int i = 0;
			int j = 10;
			j = j / i;
			System.out.println("In try");
		} catch (Exception exception) {
			System.out.println("In catch");
			System.exit(0);
			int i = 0;
			int j = 10;
			j = j / i;
		} finally {
			System.out.println("In Finally");
		}

	}

}
