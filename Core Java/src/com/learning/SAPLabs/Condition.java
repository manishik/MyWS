package com.learning.SAPLabs;

public class Condition {

	static boolean condition = true;
	public static void main(String[] args) {
		int i=0;
		if(condition)i++;
		while(condition){
			i++;
			if(i>4)break;
		}
		System.out.println(i); //What is the output? 
	}

}
