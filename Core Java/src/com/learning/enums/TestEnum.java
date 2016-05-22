package com.learning.enums;

public class TestEnum {
Day day;
	
	public TestEnum(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch (day) {
			case MONDAY: System.out.println("Mondays are bad.");
					     break;
					
			case FRIDAY: System.out.println("Fridays are better.");
					     break;
					     
			case SATURDAY:
			case SUNDAY: System.out.println("Weekends are best.");
					     break;
					     
			default:	 System.out.println("Midweek days are so-so.");
					     break;
		}
	}
	
	public static void main(String[] args) {
		TestEnum firstDay = new TestEnum(Day.MONDAY);
		firstDay.tellItLikeItIs();
		TestEnum thirdDay = new TestEnum(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		TestEnum fifthDay = new TestEnum(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		TestEnum sixthDay = new TestEnum(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		TestEnum seventhDay = new TestEnum(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}

	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	    THURSDAY, FRIDAY, SATURDAY 
	}
	
}
