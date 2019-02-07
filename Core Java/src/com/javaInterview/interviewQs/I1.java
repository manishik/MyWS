package com.javaInterview.interviewQs;

public class I1 {

	public static void main(String[] args) {

		int num = 1011101001; // count max 1's between 2 zero's

		String str = Integer.toString(num);

		System.out.println("Number = " + num);

		System.out.println("Max One Count = " + cal(str));

	}

	static int cal(String string) {

		int oneCounter = 0; 
		
		System.out.println("length = " + string.length());
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == '0') {
				oneCounter++;
			}
		}
		return oneCounter;
	}

}
