package com.learning.dateAndtime;

import java.text.DateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		Date today = new Date();
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(today));
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df1.format(today));
	}

}
