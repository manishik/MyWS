package com.learning.interviewQs;

import java.util.List;

public class Solution {

	public static void main(String[] args) {

		int a = new Solution().solution(10, 30010011);

		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "d", "e", "f", "g" };
		String[] s3 = { "h", "j", "k" };

		int N = 3;
		String s = "1A, 2B, 3K";
		String row[], row1[], row2[], row3[];
		
		for (int i = 0; i < N; i++) {
			String strArray[] = s.split(",");
			System.out.println(strArray[i]);
			//build the rows
		}
		
		
		
		
	}

	public int solution(int A, int B) {
		int pos = 0;

		String number = String.valueOf(B);
		for (int i = 0; i < number.length(); i++) {
			int j = Character.digit(number.charAt(i), 10);
			System.out.println("digit: " + j);
		}

		return pos;
	}

}
