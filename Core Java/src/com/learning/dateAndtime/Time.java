package com.learning.dateAndtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
		Date startTime = new Date();
		/*DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String today = df.format(date);*/
		
		SimpleDateFormat simpDate = new SimpleDateFormat("hh:mm:ss a");;
	    System.out.println("Time now = "+simpDate.format(startTime));
	    
	    
	    SimpleDateFormat formatPattern = new SimpleDateFormat("HH:mm:ss");
        String nowFormatted = formatPattern.format(startTime);
        System.out.println("Time nowFormatted = "+nowFormatted);
        
        
        System.out.println((startTime.getTime()));
        
        
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime().getHours());
	    
	}

}
