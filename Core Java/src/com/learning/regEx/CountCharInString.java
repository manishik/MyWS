package com.learning.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCharInString {
	public static void main(String args[]) throws Exception {

		String strPhrase = "This iS a test";

		String strDuplicatePattern = "s";

		Pattern pattern = Pattern.compile(strDuplicatePattern);
		int matches = 0;

		Matcher matcher = pattern.matcher(strPhrase);

		while (matcher.find()) {
			matches++;
		}
		System.out.println("Matches = " + matches);
	}

}
