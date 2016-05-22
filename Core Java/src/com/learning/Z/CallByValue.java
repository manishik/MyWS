package com.learning.Z;

public class CallByValue {

	int temp = 10;
	
	public static void main(String[] args) {

		CallByValue byValue = new CallByValue();
		System.out.println("Before = " +byValue.temp);
		byValue.change(50);
		System.out.println("After = " +byValue.temp);
		
		CallByValue byValue1 = new CallByValue();
		System.out.println("Before = " +byValue1.temp);
		byValue1.change(20);
		System.out.println("After = " +byValue1.temp);
		
	}

	public int change(int i){
		temp = temp + i;
		return temp;
	}
	
}
