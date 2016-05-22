package com.learning.dateAndtime;

// -----------------------------------------------------------------------------
// DateExample.java
// -----------------------------------------------------------------------------

/*
 * =============================================================================
 * Copyright (c) 1998-2009 Jeffrey M. Hunter. All rights reserved.
 * 
 * All source code and material located at the Internet address of
 * http://www.idevelopment.info is the copyright of Jeffrey M. Hunter and
 * is protected under copyright laws of the United States. This source code may
 * not be hosted on any other site without my express, prior, written
 * permission. Application to host any of the material elsewhere can be made by
 * contacting me at jhunter@idevelopment.info.
 *
 * I have made every effort and taken great care in making sure that the source
 * code and other content included on my web site is technically accurate, but I
 * disclaim any and all responsibility for any loss, damage or destruction of
 * data or any other property which may arise from relying on it. I will in no
 * case be liable for any monetary damages arising from such loss, damage or
 * destruction.
 * 
 * As with any code, ensure to test this code in a development environment 
 * before attempting to run it in production.
 * =============================================================================
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * -----------------------------------------------------------------------------
 * Used to provide an example that exercises most of the functionality of the 
 * java.util.Date class.  A Date object represents a precise moment in time, 
 * down to the millisecond. Dates are represented as a long that counts the 
 * number of milliseconds since midnight, January 1, 1970, Greenwich Meantime.
 * 
 * @version 1.0
 * @author  Jeffrey M. Hunter  (jhunter@idevelopment.info)
 * @author  http://www.idevelopment.info
 * -----------------------------------------------------------------------------
 */

public class DateExample {

    /**
     * Helper utility used to print
     * a String to STDOUT.
     * @param s String that will be printed to STDOUT.
     */
    private static void prt(String s) {
        System.out.println(s);
    }

    private static void prt() {
        System.out.println();
    }

    private static void doDateExample() throws InterruptedException {

        // To create a Date object for the current 
        // date and time use the noargs Date() constructor like this:

        prt("CURRENT DATE/TIME");
        prt("=======================================================");
        Date now = new Date();
        prt("  new Date()                   : " + now);
        prt();


        prt("CURRENT DATE/TIME (FORMATTED OUTPUT)");
        prt("=======================================================");
        SimpleDateFormat formatPattern = new SimpleDateFormat("HH/dd/yyyy HH:mm:ss");
        String nowFormatted = formatPattern.format(now);
        prt("  new Date() Formatted         : " + nowFormatted);
        prt();

        // To create a Date object for a specific time, pass the number of 
        // milliseconds since midnight, January 1, 1970, Greenwich Meantime 
        // to the constructor, like this:
        //
        // Establish a date object set in milliseconds
        // relative to 1/1/1970 GMT

        prt("DATE OBJECT FOR SPECIFIC TIME");
        prt("=======================================================");
        Date specificDate1 = new Date(24L*60L*60L*1000L);
        Date specificDate2 = new Date(0L);
        prt("  new Date(24L*60L*60L*1000L) : " + specificDate1);
        prt("  new Date(0L)                : " + specificDate2);
        prt();


        // You can return the number of milliseconds in the Date 
        // as a long, using the getTime() method. For example, 
        // to time a block of code, you might do this
        prt("USE getTime() TO RETURN MILLISECONDS");
        prt("=======================================================");
        Date startTime = new Date();
        prt("  Start Time : " + startTime);
        // ....
        // Insert any "timed code" here...
        // ...
        System.out.print("  ");
        for (int i = 0; i < 100; i++) {
            System.out.print(".");
            //Pause for 5 seconds
            Thread.sleep(5000);
        }
        prt();
        Date endTime = new Date();
        prt("  End Time  : " + endTime);
        long elapsed_time = endTime.getTime() - startTime.getTime();
        prt("  That took " + elapsed_time + " milliseconds");
        prt();

        prt("USE RESULTS FROM elapsed_time ABOVE TO FORMAT OUTPUT");
        prt("=======================================================");

        long totalTimeMillis = elapsed_time / 1000;
        String totalTimeSeconds = Integer.toString((int)(totalTimeMillis % 60));  
        String totalTimeMinutes = Integer.toString((int)((totalTimeMillis % 3600) / 60));  
        String totalTimeHours = Integer.toString((int)(totalTimeMillis / 3600));  
        for (int i = 0; i < 2; i++) {  
            if (totalTimeSeconds.length() < 2) {  
                totalTimeSeconds = "0" + totalTimeSeconds;  
            }  
            if (totalTimeMinutes.length() < 2) {
                totalTimeMinutes = "0" + totalTimeMinutes;
            }
            if (totalTimeHours.length() < 2) {
                totalTimeHours = "0" + totalTimeHours;
            }
        }
        prt("Formatted output             : " +  totalTimeHours + " hours " +
                                                 totalTimeMinutes  + " minutes " +
                                                 totalTimeSeconds + " minutes\n");


        // You can change a Date by passing the new date as a number of 
        // milliseconds since midnight, January 1, 1970, GMT, to the setTime() 
        // method, like this: 
        prt("USE gsetTime() TO CHANGE A DATE OBJECT");
        prt("=======================================================");
        Date changeDate = new Date();
        prt("  new Date()                 : " + changeDate);
        changeDate.setTime(24L*60L*60L*1000L);
        prt("  setTime(24L*60L*60L*1000L) : " + changeDate);
        prt();


        // The before() method returns true if this Date is before the Date 
        // argument, false if it's not.
        // For example 
        //   if (midnight_jan2_1970.before(new Date())) {
        // The after() method returns true if this Date is after the Date 
        // argument, false if it's not.
        // For example 
        //   if (midnight_jan2_1970.after(new Date())) {
        // The Date class also has the usual hashCode(), 
        // equals(), and toString() methods.
        prt("COMPARE DATES USING: before(), after(), equals()");
        prt("=======================================================");

        Date compareDateNow1  = new Date();
        Date compareDateNow2  = (Date) compareDateNow1.clone();
        Date compareDate1970  = new Date(24L*60L*60L*1000L);

        prt("  Compare (Equals):");
        prt("    - " + compareDateNow1);
        prt("    - " + compareDateNow2);
        if (compareDateNow1.equals(compareDateNow2)) {
            prt("    - The two dates are equal.");
        } else {
            prt("    - The two dates are NOT equal.");
        }
        prt();

        prt("  Compare (Equals):");
        prt("    - " + compareDateNow1);
        prt("    - " + compareDate1970);
        if (compareDateNow1.equals(compareDate1970)) {
            prt("    - The two dates are equal.");
        } else {
            prt("    - The two dates are NOT equal.");
        }
        prt();

        prt("  Compare (Before):");
        prt("    - " + compareDateNow1);
        prt("    - " + compareDate1970);
        if (compareDateNow1.before(compareDate1970)) {
            prt("    - " + compareDateNow1 + " comes before " + compareDate1970 + ".");
        } else {
            prt("    - " + compareDateNow1 + " DOES NOT come before " + compareDate1970 + ".");
        }
        prt();

        prt("  Compare (After):");
        prt("    - " + compareDateNow1);
        prt("    - " + compareDate1970);
        if (compareDateNow1.after(compareDate1970)) {
            prt("    - " + compareDateNow1 + " comes after " + compareDate1970 + ".");
        } else {
            prt("    - " + compareDateNow1 + " DOES NOT come after " + compareDate1970 + ".");
        }
        prt();



        prt("RETRIEVE MILLISECONDS");
        prt("=======================================================");

        // Establish a date object set in milliseconds relative to 1/1/1970 GMT
        Date y = new Date(1000L*60*60*24);

        // Retrieve the number of milliseconds since 1/1/1970 GMT (31536000000)
        long n = y.getTime();
        prt("  Number of milliseconds since 1/1/1970 (GMT) : " + n);

        // Computes a hashcode for the date object (1471228935)
        int i = y.hashCode();
        prt("  Hash code for object                        : " + i);

        // Retrieve the string representation of the date (Thu Dec 31 16:00:00 PST 1970)
        String s = y.toString();
        prt("  String  representation of date              : " + s);
        prt();

        prt("PARSE STRING TO DATE");
        prt("=================================================================");
        Date   newDate;
        String inputDate = "1994-02-14";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print("  " + inputDate + " parses as ");
        try {
            newDate = formatter.parse(inputDate);
            prt(newDate + ".");
        } catch (ParseException e) {
            prt("Unparseable using " + formatter + ".");
        }    
        prt();

    }


    public static void main(String[] args) {
        prt();
        try {
            doDateExample();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
