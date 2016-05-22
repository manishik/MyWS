package com.learning.dateAndtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
	public static void main(String[] args) {
		
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String today = (DateFormat.getDateInstance(DateFormat.FULL)).format(date);
		System.out.println("Today = "+today);
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Year = "+cal.get(Calendar.YEAR));
		System.out.println("Date = "+cal.get(Calendar.DATE));
		System.out.println("HOUR = "+cal.get(Calendar.HOUR));
		System.out.println("MINUTE = "+cal.get(Calendar.MINUTE));
						
		//Add a day
		//cal.setTime(date);
		cal.add(Calendar.DATE, 1); //Here you add 1 day
		Date tomorrow = cal.getTime();
		System.out.println("Tomorrow = "+tomorrow);
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		
		System.out.println("Tomorrow Formatted = "+df1.format(tomorrow));
		
		//Day after tomorrow
		cal.add(Calendar.DATE, 1); //Here you add another day
		Date dayAfterTomorrow = cal.getTime();
		System.out.println("Day After Tomorrow = "+dayAfterTomorrow);
		
		if(df1.format(tomorrow).equals(today)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
		//Add a month
		cal.setTime(date);
		cal.add(Calendar.MONTH, 1);
		Date d2 = cal.getTime();
		System.out.println("A Month after Today = "+d2);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("A Month after Today with Formating = "+df3.format(d2));
	
		String s1 = "1/1/08";
		try{
			//String s1 = "Thursday, January 31, 2008";
			Date dtTmp = new SimpleDateFormat("d/M/yy").parse(s1);
			System.out.println("Date = "+dtTmp);
			
			String strOutDt = new SimpleDateFormat("d/M/yyyy").format(dtTmp);
			System.out.println("Date == "+strOutDt);
		}catch(Exception e){
			
		}
		
		//Calculate Age by giving DOB
		Calendar dateOfBirth = new GregorianCalendar(1981, Calendar.MARCH, 11);
		Calendar today1 = Calendar.getInstance();
		int age = today1.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
		
		System.out.println("Age = "+age);
		
		int MaxPwdChangeDay = 30;
		String ss = "1/2/09";
		try{
			Date dtTmp = new SimpleDateFormat("d/M/yy").parse(ss);
			System.out.println(dtTmp);
			Date CurrentDay = new Date();
			System.out.println("CurrentDay = "+CurrentDay);
			System.out.println((CurrentDay.getTime() - dtTmp.getTime())/(1000*24*60*60));
			if((CurrentDay.getTime() - dtTmp.getTime())/(1000*24*60*60)>=MaxPwdChangeDay){
				//Force Pwd Change
				System.out.println("Correct");
			}
			else{
				//Continue Validating
				System.out.println("Incorrect");
			}
			
		}catch(Exception e){
			
		}
	}
}
