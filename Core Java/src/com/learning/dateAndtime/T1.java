package com.learning.dateAndtime;

import java.util.Calendar;
import java.util.Date;

public class T1 {
	public static void main(String[] args) {
		Date currentDate = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(currentDate);
		System.out.println("Current Date = "+currentDate);
		System.out.println("currentDate = " + c1.getTime());
		System.out.println("currentDate = " + c1.get(Calendar.DATE));

		Date maturityDate = new Date();
		Calendar c2 = Calendar.getInstance();
		c2.setTime(maturityDate);
		c2.add(Calendar.DATE, 2);

		System.out.println("maturityDate + 2 = " + c2.getTime());

		if (c2.after(c1)) {
			System.out.println("(maturityDate + 2) > currentDate");
		} else {
			System.out.println("(maturityDate + 2) < currentDate");
		}
	}
}
