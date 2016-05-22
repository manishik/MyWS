package com.learning.string;

public class StringBufferTest {

	public static void main(String[] args) {

		StringBuffer buf = new StringBuffer();
		buf.append("123");
		buf.append("123");
		buf.append("123");
		buf.append("123");
		System.out.println(buf);

		buf.append("123");
		buf.append("123");
		System.out.println(buf);

		buf = new StringBuffer();
		buf.append("456");
		buf.append("567");
		System.out.println(buf);
	}

}
