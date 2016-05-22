package com.learning.Z;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

public class R1 {
	public static void main(String[] args) {
		final String strExpression = "[a-zA-Z 0-9]";
		RegularExpression regularExpression = new RegularExpression(
				strExpression);
		System.out.println(regularExpression.matches("123"));
		System.out.println(regularExpression.matches("abc"));
		System.out.println(regularExpression.matches(" "));
		System.out.println(regularExpression.matches("*&%!~"));
	}
}
