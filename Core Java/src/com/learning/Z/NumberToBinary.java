package com.learning.Z;

import java.util.Scanner;

public class NumberToBinary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		String binary = "";
		if (n == 0) {
            binary = "0";
        }
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        System.out.println(binary);
        
	}

}
