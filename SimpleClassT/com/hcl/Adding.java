package com.hcl;

public class Adding {

	public static void main(String[] args) {
		Calc calcObj = new Calc();
		int intResult = calcObj.addint(22, 11);
		float floatResult = calcObj.addfloat(22l, 33f);
		System.out.println("Integer Result = " + intResult);
		System.out.println("Float Result = " + floatResult);
	}
	
}
