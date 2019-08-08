package com.javaInterview.equalsHashCode;

import java.util.Hashtable;

public class Test {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;
		
		Hashtable ht = new Hashtable();
		ht.put(x,1);
		ht.put(y,3);
		
		System.out.println(ht);
		System.out.println(ht.hashCode());
		
	}

}
