package com.learning.string;

public class StringTest {

	public static void main(String[] args) {
		
		String s1 = "Manish";
		String s2 = new String("Indudhar");

		System.out.println("s1+s2 = "+s1+s2);
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		
		String s3 = s1+" "+s2;
		System.out.println("s3 = "+s3);
		
		String s4 = s1+" Keshav "+s2;
		System.out.println("s4 = "+s4);
	}

}
