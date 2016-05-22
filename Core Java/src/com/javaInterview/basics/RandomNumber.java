package com.javaInterview.basics;

public class RandomNumber {

	public static void main(String[] args) {

		getRandomNumber();

	}

	public static int getRandomNumber() {

		//Random numbers between 1 and 10
		Double d = Math.random() * 10;
		System.out.println(d);
		System.out.println(d.intValue());
		return d.intValue();
		
		//Random numbers between 1 and 99
		/*Double d = Math.random() * 100;
		System.out.println(d.intValue());
		return d.intValue();*/
		
		//Random numbers between 1 and 999
		/*Double d = Math.random() * 1000;
		System.out.println(d.intValue());
		return d.intValue();*/
		
	}

}
