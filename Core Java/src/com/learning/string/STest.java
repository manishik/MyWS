package com.learning.string;

public class STest {
	public static void main(String[] args) {
		String s1 = "";
		//System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		
		String s2 = "HeY";
		String s3 = s2.substring(2, 3);
		System.out.println("s3 = "+s3);
		
		
		StringBuffer ss = new StringBuffer("11");
		System.out.println(ss.append("manish"));
		System.out.println(ss.length());
	}

}
