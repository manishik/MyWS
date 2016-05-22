package com.hcl;

public class Calculator {

	public int addInt(int a, int b) {
		return a + b;
	}

	public int subInt(int a, int b) {
		return a - b;
	}

	public int multiplyInt(int a, int b) {
		return a * b;
	}

	public int divideInt(int a, int b) {
		if(b!=0){
			return a / b;
		}else{
			return 0;
		}
	}

	public float addFloat(float a, float b) {
		return a + b;
	}

	public float subFloat(float a, float b) {
		return a - b;
	}

	public float multiplyFloat(float a, float b) {
		return a * b;
	}

	public float divideFloat(float a, float b) {
		if(b!=0){
			return a / b;
		}else{
			return 0;
		}
	}

}
