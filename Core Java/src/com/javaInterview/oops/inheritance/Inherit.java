package com.javaInterview.oops.inheritance;

import java.util.Scanner;

public class Inherit {

	public static void main(String[] args) {
		/*int[] arr = new int[] { 50, 100, 300 };
		Student student = new Student("Heraldo", "Memelli", 8135627, arr);
		student.printPerson();
		System.out.println(student.calculate(arr));*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter FirstName");
		String firstName = scan.next();
		System.out.println("Enter LastName");
		String lastName = scan.next();
		System.out.println("Enter ID");
		int id = scan.nextInt();
		System.out.println("Enter number of scores");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		System.out.println("Enter scores");
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id); //Remember
		this.testScores = scores;
	}

	public char calculate() {
		int len = testScores.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum + testScores[i];
		}
		int avg = sum/len;
		if (avg <= 100 && avg >= 90) {
			return 'O';
		}
		if (avg >= 80 && avg < 90) {
			return 'E';
		}
		if (avg >= 70 && avg < 80) {
			return 'A';
		}
		if (avg >= 55 && avg < 70) {
			return 'P';
		}
		if (avg >= 40 && avg < 55) {
			return 'D';
		}
		return 'T';
	}
}
