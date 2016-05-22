package com.javaInterview.collections.listAndArrays;

import java.util.ArrayList;
import java.util.Arrays;


class ArrayListToArray {
	public static void main(String args[]) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(5); arrayList.add(6); arrayList.add(9); 
		arrayList.add(8); arrayList.add(1); arrayList.add(99); arrayList.add(50);

		System.out.println("ArrayList " + arrayList);

		Integer ia[] = new Integer[arrayList.size()];
		ia = arrayList.toArray(ia); //Converting ArrayList to Array.
		System.out.println(ia);
		System.out.print("Integer Array  ");
		System.out.print("[");
		for (int i : ia) {
			System.out.print(" " + i);
		}
		System.out.println(" ] ");
		
		Arrays.sort(ia);
		
		/*Integer ib[] = new Integer[ia.length], temp;
		for (int i = 0; i < ia.length; i++) {
			for (int j = 0; j < ib.length; j++) {
				temp = ia[i];
				ib[ia.length-1] = temp;
				System.out.println("Rev = "+ib[j]);
			}
		}*/
		
		System.out.print("Sorted Integer Array ");
		System.out.print("[");
		for (int i = 0; i < ia.length; i++) {
			System.out.print(" " + ia[i]);
		}
		System.out.println(" ] ");
		int sum = 0;

		for (int i : ia)
			sum += i;

		System.out.println("Sum = " + sum);

	}
}
