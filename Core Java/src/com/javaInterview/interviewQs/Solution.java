package com.javaInterview.interviewQs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Test from Cisco on 27th May 2018 to validate an ip address

class MyRegex extends Solution {

	private Pattern patern;
	String validIp;

	private static final String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public MyRegex(String iP) {
		patern = Pattern.compile(pattern);
		validIp = iP;
	}

	public boolean isMatch() {
		// Write your code here
		return pattern.matches(validIp);
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String iP = in.next();
			MyRegex mr = new MyRegex(iP);
			System.out.println(mr.isMatch());
		}
		in.close();
	}
}