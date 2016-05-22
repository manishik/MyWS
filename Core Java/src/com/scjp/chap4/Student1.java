package com.scjp.chap4;

class Student1 {
	public static void main(String[] args) {
		int score = 75;
		Student1 st = new Student1();
		st.modifyStudent(score);
		System.out.println("The original student score: " + score);
	}

	void modifyStudent(int i) {
		i = i + 10;
		System.out.println("The modified student score: " + i);
	}
}