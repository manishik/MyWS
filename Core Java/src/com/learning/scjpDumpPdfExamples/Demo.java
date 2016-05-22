package com.learning.scjpDumpPdfExamples;

import static com.learning.scjpDumpPdfExamples.Repetition.twice;

public class Demo {
	public static void main(String[] args) {
		System.out.println(twice("pizza"));
	}
}

class Repetition {
	public static String twice(String s) {
		return s + s;
	}
}