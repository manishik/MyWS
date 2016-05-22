package com.javaInterview.collections.listAndArrays;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Manish");
		list.add("11");
		// list.add(new Date()); 
		// Don't mix and match!

		Object[] ol = list.toArray();
		System.out.println("Array of Object has length " + ol.length);

		String[] sl = (String[]) list.toArray(new String[0]);
		System.out.println("Array of String has length " + sl.length);

		List<String> ll1 = new ArrayList<String>();
		ll1.add("A");
		ll1.add("A");
		ll1.add(null);
		ll1.add("B");
		
		List<String> l1 = new ArrayList<String>();
		l1.add("A");
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.addAll(ll1);

		StringBuffer sb = new StringBuffer();
		
		Object[] o2 = l1.toArray();
		for (Object o : o2) {
			String ss = (String) o;
			System.out.println(ss);
			sb.append(ss);
		}

		System.out.println("StringBuffer = "+sb);
		
		l1.remove(ll1);
		System.out.println("List = "+l1);
	}

}
