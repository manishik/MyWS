package com.javaInterview.basics;

public class WrapperConversion {

	public static void main(String[] args) {
		
		//Remember the pre-defined methods
		Integer i3 = new Integer(23); 
		int i = i3.intValue(); //converting wrapper to primitive
		System.out.println(i);
		Integer i4 = i3.intValue(); 
		System.out.println(i4);
		
		int j = 10;
		Integer i5 = Integer.valueOf(j); //converting primitive to wrapper
		System.out.println(i5);
		
		Integer i6 = new Integer(555);
		System.out.println("Integer = "+i6);
		
		Integer i7 = 666;
		System.out.println("Integer = "+i7);
	}

}
