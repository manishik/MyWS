package com.learning.java2s.hashcodes;

import java.io.File;

public class P1 {

	public static void main(String[] args) throws Exception {
		File file1 = new File("a");
		File file2 = new File("a");
		File file3 = new File("b");

		int hc1 = file1.hashCode();
		System.out.println(hc1);
		int hc2 = file2.hashCode();
		System.out.println(hc2);
		int hc3 = file3.hashCode();
		System.out.println(hc3);
	}
}
