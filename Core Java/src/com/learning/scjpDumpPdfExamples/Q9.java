package com.learning.scjpDumpPdfExamples;

import java.util.*;

public class Q9 {

	public static void main(String[] args) {

		Object o = Old.get0(new LinkedList());
		//Object o1 = Old.get0(new LinkedList<?>()); //Compilation Fails
		//String s = Old.get0(new LinkedList<String>()); //Compilation Fails
		Object o2 = Old.get0(new LinkedList<Object>());
		String s1 = (String) Old.get0(new LinkedList<String>());

	}

	public static class Old {
		public static Object get0(List list) {
			return list.get(0);
		}
	}

	//Remember
	//static methods can only be declared in a static or top level type
	//can't have a static method in a nested class
	/*public class Old1 {
		public static Object get0(List list) {
			return list.get(0);
		}
	}*/
}
