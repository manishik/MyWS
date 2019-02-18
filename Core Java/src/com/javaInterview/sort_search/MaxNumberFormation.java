package com.javaInterview.sort_search;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumberFormation {

	public static void main(String[] args) {

		Integer[] array = { 4, 3, 75, 44, 30 };
		//print max number 
		
		StringBuffer buffer = new StringBuffer();
		
		Arrays.sort(array, new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2) {
				String leftRight = o1+""+o2;
				String rightLeft = o2+""+o1;
				return leftRight.compareTo(rightLeft);
			}
		});
		
		for (int i = array.length - 1; i >= 0; i--){
			buffer.append(array[i]);
		}
		System.out.println(buffer);
	}

}

