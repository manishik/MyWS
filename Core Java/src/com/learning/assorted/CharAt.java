package com.learning.assorted;

import java.io.*;

public class CharAt {
	public static void main(String[] args) {
		try {
			BufferedReader object = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter the String");
			String string = object.readLine();
			int length = string.length();
			System.out.println("Length = "+length);
			char char1 = string.charAt(4);
			System.out.println(char1);
		} catch (Exception e) {
		}
	}
}
