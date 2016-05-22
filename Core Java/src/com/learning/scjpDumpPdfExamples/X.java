package com.learning.scjpDumpPdfExamples;

import java.util.*;

public class X {

	public static void main(String[] args) {

		ArrayList<String> x1 = new ArrayList<String>();
		//foo(x1); //The method foo(List<Object>) in the type X is not applicable for the arguments (ArrayList<String>)

		//ArrayList<Object> x2 = new ArrayList<String>(); //Won't compile
		//foo(x2);

		ArrayList<Object> x3 = new ArrayList<Object>();
		foo(x3);

		ArrayList x4 = new ArrayList();
		foo(x4);

	}

	public static void foo(List<Object> list) {
	}

}
