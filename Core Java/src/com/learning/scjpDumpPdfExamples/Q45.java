package com.learning.scjpDumpPdfExamples;

public class Q45 {

	public static void main(String[] args) {
		System.out.format("Pi is approximately %d.", Math.PI); //Incorrect //Runtime exception
		System.out.format("Pi is approximately %f.", Math.PI); //Correct way
	}

}
