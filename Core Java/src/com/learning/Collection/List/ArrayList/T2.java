package com.learning.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T2 {

	public static void main(String[] args) {
		String s1 = "Manish";
		String s2 = "Indudhar";
		String s3 = "Max";
		String s4 = "Bubble";

		List<String> list = new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(null);
		
		System.out.println(list);
		
		for (String str : list) {
			System.out.println(str);
		}
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}

}
