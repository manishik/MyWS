package com.learning.numberFormatting;

import java.util.Date;

public class Class {

	public static void main(String[] args) {
		String s = String.format("%d", 1000000000); //For Decimal its %d
		System.out.println(s);
		String s1 = String.format("%,d", 1000000000); //With Comma
		System.out.println(s1);
		String s2 = String.format("I have %.2f bugs to fix", 476543.09876); //For Float its %f
		System.out.println(s2);
		String s3 = String.format("I have %,.2f bugs to fix", 476543.09876); //With Comma
		System.out.println(s3);
		
		int one = 2037989237;
		double two = 10000043847.983798;
		String s4 = String.format("The rank is %,d out of %,.3f", one, two);//With Comma
		System.out.println(s4);
		
		char character = 'a';
		System.out.println(""+String.format("Here this place %c we put a Character", character));
		//For character its %c
		
		System.out.println("Date = "+String.format("%tc",new Date())); //For Date its %tc
		System.out.println("Time = "+String.format("%tr",new Date())); //For Time its %tr
		
		Date today = new Date();
		System.out.println(""+String.format("%tA, %tB, %td", today, today, today));
		System.out.println(""+String.format("%tA, %<tB, %<td", today));
	}

}
