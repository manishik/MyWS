package com.learning.scjpDumpPdfExamples;

import java.util.Scanner;

public class Q183 {

	public static void main(String[] args) {

		//Search for only booleans		
		Scanner scanner = new Scanner("One,5,true,3,true,6,7,false");
		scanner.useDelimiter(",");

		while (scanner.hasNext()) {
			if (scanner.hasNextBoolean()) {
				System.out.println(scanner.nextBoolean());
			} else
				scanner.next();
		}
	}
}
