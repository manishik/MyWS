package com.javaInterview.map;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConHM {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		al.add("SE");al.add("SSE");al.add("SSE");al.add("TL");al.add("PL");al.add("Arc");
		
		Set lhs = new LinkedHashSet();
		lhs.add("Strawberry");lhs.add("Berries");lhs.add("Apple");lhs.add("Apple");lhs.add("Banana");

		ConcurrentHashMap chm = new ConcurrentHashMap<>();
		chm.put("Manish", "Java Programmer");
		chm.put("Manish", "Java Programmer");
		chm.put("Manish", "Java Techie");
		chm.put("Indudhar", "Java Lead");
		chm.put("Indudhar", al);
		chm.put(al, al);
		chm.put(al, lhs);
		
		//Runtime Exception - comment below line to run... 
		//chm.put(null, "Java Programmer");  
		
		System.out.println("ConcurrentHashMap = "+chm);
		
		
	}

}
