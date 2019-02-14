package com.javaInterview.topQuestions;

public class Palindrome {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 2, 1 };
		String[] strArray = new String[] { "Manish", "Indudhar", "Keshav", "Indudhar", "Manish" };
		char charArray[] = new char[] { 'b', 'a', 'z', 'a', 'b' };
		if (palindrome(charArray)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

	public static boolean palindrome(char[] array) {
		boolean flag = false;
		int i = array.length - 1;
		for (int j = 0; j <= i; j++, i--) {
			System.out.println("j = " + array[j]);
			System.out.println("i = " + array[i]);
			if (array[j] == array[i]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
