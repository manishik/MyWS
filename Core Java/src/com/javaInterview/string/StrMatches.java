package com.javaInterview.string;

public class StrMatches {

	public static void main(String[] args) {
		String s1 = "Manish";
		String s2 = "ManisH";
		String s3 = "Nandini";
		String s4 = "Nandini";
		System.out.println("Matches = " + s1.matches(s2));
		System.out.println("Matches = " + s3.matches(s4));
		
		String s5 = new String("Nandini");
		String s6 = new String("NandinI");
		
		System.out.println("Matches = " + s5.matches(s6));
		
	}
}
