package com.javaInterview.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackOperation {

	public static void main(String[] args) throws IOException {

		int array[], arraySize, x, i, choice, p;
		int top = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nEnter the Stack Size\n");
		arraySize = Integer.parseInt(br.readLine());
		array = new int[arraySize];
		do {
			System.out.println("\nEnter U'r Choice \n");
			System.out.println("\n 1. PUSH OPERATION ");
			System.out.println("\n 2. POP OPERATION ");
			System.out.println("\n 3. TO PRINT THE CONTENTS ");
			System.out.println("\n 4. QUIT\n");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("\nEnter the Element to be Inserted\n");
				x = Integer.parseInt(br.readLine());
				if (top > arraySize - 1)
					System.out.println("\nOverflow Condition");
				else {
					top = top + 1;
					array[top - 1] = x;
				}
				break;
			case 2:
				if (top == 0)
					System.out.println("\nUnderflow Condition");
				else {
					top = top - 1;
					p = array[top];
					array[top] = 0;
					System.out.println("\nThe Popped Element = " + p);
				}
				break;
			case 3:
				System.out.println("\nThe contents of the Stack are\n" );
				if (top <= 0) {
					System.out.println("\nThe Stack is Empty\n");
					System.exit(0);
				} else {
					for (i = arraySize - 1; i >= 0; i--)
						System.out.println(" " + array[i]);
					//Reverse way of printing the stack
					/*for (i = 0; i <= arraySize - 1; i++)
						System.out.println(" " + array[i]);*/
				}
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("\nInvalid Choice\n");
				System.exit(0);
			}
		} while (choice != 4);
	}
}
