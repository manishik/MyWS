package com.learning.BreakContinue;

public class ContinueDemo {
	public static void main(String[] args) {

		StringBuffer searchMe = new StringBuffer("peter piper picked a peck of pickled peppers");

		int numPs = 0;

		for (int i = 0; i < searchMe.length(); i++) {
			// interested only in p's
			if (searchMe.charAt(i) == 'p')
				numPs++; // process p's
			else 
				continue;
			searchMe.setCharAt(i, 'P');
		}
		System.out.println("Found " + numPs + " p's in the string.");
		System.out.println(searchMe);
	}

}
