package com.interview.manish.service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		someM("111111111111111");
		
	}

	static void someM(String ccNo) {

		if (ccNo.matches("[0-9]+") && ccNo.length() < 16) {
			System.out.println(ccNo);
		}

	}

}
