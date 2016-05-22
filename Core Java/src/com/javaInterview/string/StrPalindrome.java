package com.javaInterview.string;

public class StrPalindrome {

	public static boolean isPalindrome(String stringToTest) {
		String workingCopy = removeJunk(stringToTest);
		String reversedCopy = reverse(workingCopy);

		return reversedCopy.equalsIgnoreCase(workingCopy);
	}

	protected static String removeJunk(String string) {
		int i, len = string.length();
		StringBuffer dest = new StringBuffer(len);
		char c;

		for (i = (len - 1); i >= 0; i--) {   // Reverse Iteration 
			c = string.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				dest.append(c);
			}
		}
		return dest.toString();
	}
	
	/*protected static String removeJunk(String string) {
		String b = string.replaceAll("\\s+", "");
		return b;
	}*/

	protected static String reverse(String string) {
		StringBuffer sb = new StringBuffer(string);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String string = "Madam, I'm Adam.";

		System.out.println();
		System.out.println("Testing whether the following "
				+ "string is a palindrome:");
		System.out.println("    " + string);
		System.out.println();

		if (isPalindrome(string)) {
			System.out.println(string + " " + "is a palindrome!");
		} else {
			System.out.println(string + " " + "is NOT a palindrome!");
		}
		System.out.println();
	}
}