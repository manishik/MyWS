package com.javaInterview.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringConversion {

	public static void main(String[] args) {
		String s1 = "100";
		
		System.out.println("String s1 = "+s1);
		
		// parseShort converts String to short
		short s = Short.parseShort(s1);
		System.out.println("S1 to short = " + s);
		
		// parseInt converts String to Integer
		int i = Integer.parseInt(s1);
		System.out.println("S1 to int = " + i);
		
		// parseLong converts String to Long
		long l = Long.parseLong(s1);
		System.out.println("S1 to long = " + l);
		
		// parseFloat converts String to Float
		float f = Float.parseFloat(s1);
		System.out.println("S1 to float = " + f);
		
		// parseDouble converts String to Double
		double d = Double.parseDouble(s1);
		System.out.println("S1 to double = " + d);

		
		// parseDouble converts String to Double
		double dd = Double.valueOf(s1);
		System.out.println("dd = " + dd);
		
		
		
		int i1 = 200;
		// toString converts int to String
		String s2 = Integer.toString(i1);
		System.out.println("S2 = " + s2);

		// toString converts boolean to String
		boolean b1 = true;
		String s3 = Boolean.toString(b1);
		System.out.println("S3 = " + s3);

		// converts String array to List
		String[] sa = { "one", "two", "three", "four" };
		List<String> sList = Arrays.asList(sa); // make a List
		System.out.println("size " + sList.size());
		System.out.println("idx2 " + sList.get(2));
		
		//Get contents of List using Iterators
		Iterator<String> it = sList.iterator();
		System.out.println();
		while(it.hasNext()){
			String s4 = (String)it.next();
			System.out.println(s4);
		}
	}

}
