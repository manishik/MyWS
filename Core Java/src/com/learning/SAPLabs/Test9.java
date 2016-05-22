package com.learning.SAPLabs;

public class Test9 {

	public static void main(String[] args) {
		int i = 0;
		StringBuffer buffer = new StringBuffer("Hello");
		process(buffer, i);
		System.out.println(buffer + "," + i);
	}

	static void process(StringBuffer s, int i) {
		s.append(" World!");
		i++;
		//System.out.println(i);
	}

}
