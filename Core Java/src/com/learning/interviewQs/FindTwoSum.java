package com.learning.interviewQs;

import java.util.ArrayList;
import java.util.List;

public class FindTwoSum {

	public static void main(String[] args) {
		FindTwoSum p1 = new FindTwoSum();
		List l = new ArrayList<>();
		l.add(1); l.add(2); l.add(9); l.add(8);
		int s = 10;
		p1.findTwoSum(l, s);
	}

	int findTwoSum(List l1, int sum) {
		int pos = 0, pos2 = 0;

		for (int j = 0; j < l1.size(); j++) {
			for (int i = 1; i < l1.size(); i++) {
				int n = (int) l1.get(i);
				int nn = (int) l1.get(j);
				System.out.println("1st = " + n);
				System.out.println("2nd = " + nn);
				int chSum = nn + n;
				System.out.println("Sum = " + chSum);
				if (chSum == sum) {
					System.out.println("I");
					pos = i;
					pos2 = j;
					// need to return both the positions here..
				} else {

				}
			}
		}
		System.out.println("Pos = " + pos);
		System.out.println("Pos2 = " + pos2);
		return pos;
	}
}
