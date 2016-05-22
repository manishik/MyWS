package com.learning.dataTypes;

public class IntOverflow {
	public static void main(String[] unused) {
		do_shorts();
		do_ints();
	}

	protected static void do_shorts() {
		short s = Short.MAX_VALUE;
		System.out.println("s=" + s++);
		System.out.println("s=" + s++);
		System.out.println("s=" + s++);
	}

	protected static void do_ints() {
		int i = Integer.MAX_VALUE;
		System.out.println("i=" + i);
		System.out.println("i=" + i++);
		System.out.println("i=" + i++);
		System.out.println("i=" + i++);
		
		int j = Integer.MIN_VALUE;
		System.out.println("j="+j);
	}
}
