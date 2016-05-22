package com.learning.java2s.hashcodes;

import java.io.File;

public class P2 {

	public static void main(String[] args) {
		File file1 = new File("a");
		File file2 = new File("a");
		File file3 = new File("b");

		int ihc1 = System.identityHashCode(file1);
		System.out.println(ihc1);
		int ihc2 = System.identityHashCode(file2);
		System.out.println(ihc2);
		int ihc3 = System.identityHashCode(file3);
		System.out.println(ihc3);
	}
}
