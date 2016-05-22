package com.javaInterview.string;

import java.util.Scanner;

public class RemoveSpacesOfStr {

	public static void main(String[] args) {
		String str;

		Scanner scanner = new Scanner(System.in);
		System.out.println("*********White Space Remover Program************\n");
		System.out.println("Enter your String\n");
		str = scanner.nextLine();
		System.out.println("Input String is  :\n" + str);
		scanner.close();

		String b = str.replaceAll("\\s+", ""); // Using Regular Expression.

		String c = str.replace(" ", "");

		System.out.println("\nOutput String using regEx is  :\n" + b);
		System.out.println("\nOutput String is  :\n" + c);

	}

}
