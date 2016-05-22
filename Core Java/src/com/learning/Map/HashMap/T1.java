package com.learning.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class T1 {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> tradesMoved = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("t1");
		a1.add("t2");
		a1.add("t3");
		a1.add("t4");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("t5");
		a2.add("t6");
		a2.add("t7");
		a2.add("t8");
		
		tradesMoved.put("Agenda1", a1);
		tradesMoved.put("Agenda2", a1);
		tradesMoved.put("Agenda3", a2);
		tradesMoved.put("Agenda3", a1);
		tradesMoved.put("Agenda3", a2);
		
		System.out.println("tradesMoved HashMap= "+tradesMoved);
		
		ArrayList<String> l1 = tradesMoved.get("Agenda3");
		
		System.out.println(l1);
	}
	
}
