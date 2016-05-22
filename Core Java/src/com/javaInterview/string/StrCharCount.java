package com.javaInterview.string;

public class StrCharCount {

	public static void main(String[] args) {

		String str = "Quick brown fox jumps over the lazy dog";
		String emptyStr = "";
		int length = str.length();
		while (length != 0) {
			int count = 0;
			String ch = str.substring(0, 1);
			for (int i = 0; i < length; i++) {
				String t = str.substring(i, i + 1);
				if (!(t.equalsIgnoreCase(ch))) {
					emptyStr = emptyStr + str.substring(i, i + 1);
				} else {
					count++;
				}
			}
			System.out.println("The character " + ch + " appears " + count + " time(s)");
			str = emptyStr;
			length = str.length();
			emptyStr = "";
		}
	}
}
