package com.learning.scjpDumpPdfExamples;

public class Q11 {
	public static void main(String[] args) {
		Fo.alpha();
		//Fo.beta(); //can't call directly, need instance of "Fo" class
	}
}

class Fo {
	static void alpha() { 
		System.out.println("Fo:alpha");
		//beta(); //Compilation fails
	}

	void beta() { 
		System.out.println("Foo:beta");
		alpha(); 	//Calling alpha directly
	}
}