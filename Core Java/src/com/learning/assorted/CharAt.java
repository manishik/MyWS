package com.learning.assorted;

import java.io.*;

public class CharAt {
	public static void main(String[] args) {
		try {
			int n = 8;
			BufferedReader object = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter the String");
			String string = object.readLine();
			int length = string.length();
			System.out.println("Length = "+length);
			char char1 = string.charAt(n);
			System.out.println("Character at " + n + " position is : " + char1);
		} catch (Exception e) {
		}
	}
}
