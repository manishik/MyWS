package com.learning.enums;

enum AccountType {
	SAVING, FIXED, CURRENT;
	private AccountType() {
		System.out.println("It is a account type");
	}
	//enum constuctor gets called as many times as the number of constants inside 
}

public class EnumOne {
	public static void main(String[] args) {
		System.out.println(AccountType.FIXED);
	}
}
