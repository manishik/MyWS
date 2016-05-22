package com.learning.dateAndtime;

public class P1 {

	public static void main(String[] args) {

		long l1 = System.currentTimeMillis();
		String s1 = timeAsString(l1);
		System.out.println(s1);
	}

	public static String timeAsString(long milliSecs) {
		String s = "";
		int days = (int) (milliSecs / (1000 * 60 * 60 * 24));
		int hours = (int) (milliSecs % (1000 * 60 * 60 * 24)) / 3600000;
		int minutes = (int) (milliSecs % 3600000) / 60000;
		double seconds = (double) (milliSecs % 60000) / 1000;
		if (days != 0) {
			s += days + " days, ";
		}
		if (hours != 0) {
			s += hours + " h, ";
		}
		if (minutes != 0) {
			s += minutes + " min, ";
		}
		s += seconds + " sec";
		return s;
	}

}
