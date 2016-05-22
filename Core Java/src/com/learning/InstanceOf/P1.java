package com.learning.InstanceOf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class P1 {
	public static void main(String[] args) {
		Object testObject = new HashMap<Object, Object>();
		if (testObject instanceof Vector)
			System.out.println("Object was an instance of the class java.util.Vector");
		else if (testObject instanceof ArrayList)
			System.out.println("Object was an instance of the class java.util.ArrayList");
		else
			System.out.println("Object was an instance of the "	+ testObject.getClass());
	}

}
