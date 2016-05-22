package com.learning.SAPLabs;

public class StringCheck {

	public static void main(String[] args) {

		String s = new String();
		if (s.trim().equals("")) {
			s = null;
		} else {
			s = new String("Hello");
		}
		try {
			if (s.length() > 0) {
				System.out.println(s);
			}
		} catch (NullPointerException exception) {
			System.out.println("in NullPointerException");
		} catch (Exception exception) {
			System.out.println("s is null");
		} finally {
			System.out.println("s is null");
		}

	}
}
