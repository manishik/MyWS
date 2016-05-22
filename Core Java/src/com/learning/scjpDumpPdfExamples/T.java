package com.learning.scjpDumpPdfExamples;

public class T {

	public static void main(String[] args) {
		parse("Invalid");
	}

	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			System.out.println("In Catch block");
			// f = 0; //Compilation fails, can't resolve "f"
		} finally {
			//System.out.println(f); //Compilation fails, can't resolve "f"
		}
	}

}

