package com.learning.II_Sem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Program for Linear and Binary Search */

public class LBS {

	public static void main(String[] args) throws IOException {

		int a[], temp, i, j, n, item, beg, mid, end, choice, i1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Enter u'r Choice for Searching\n");
			System.out.println("Type '1' for Linear Search\n");
			System.out.println("Type '2' for Binary Search\n");
			i1 = Integer.parseInt(br.readLine());
			switch (i1) {
			case 1:
				System.out.println("U have selected Linear Search\n");
				System.out.println("Enter the Maximum Limit\n");
				n = Integer.parseInt(br.readLine());
				a = new int[n];
				System.out.println("Enter the Elements\n");
				for (i = 0; i < n; i++)
					a[i] = Integer.parseInt(br.readLine());
				System.out.println("Given Elements are\n");
				for (i = 0; i < n; i++)
					System.out.println(" " + a[i]);
				System.out.println("Enter the element to be Searched\n");
				item = Integer.parseInt(br.readLine());
				System.out.println("Element to be Searched = " + item);
				for (i = 0; i < n; i++) {
					if (item == a[i]) {
						System.out.println("Element Found\n");
						System.exit(0);
					}
				}
				System.out.println("Element Not Found\n");
				break;
			case 2:
				System.out.println("U have selected Binary Search\n");
				System.out.println("Enter the Maximum Limit\n");
				n = Integer.parseInt(br.readLine());
				a = new int[n];
				System.out.println("Enter the Elements\n");
				for (i = 0; i < n; i++)
					a[i] = Integer.parseInt(br.readLine());
				System.out.println("Given Elements are\n");
				for (i = 0; i < n; i++)
					System.out.println(" " + a[i]);

				for (i = 0; i < n - 1; i++)
					for (j = i + 1; j < n; j++) {
						if (a[i] > a[j]) {
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				System.out
						.println("The Sorted(Ascending Order) Elements are\n");
				for (i = 0; i < n; i++)
					System.out.println(" " + a[i]);
				System.out.println("Enter the Element to be searched\n");
				item = Integer.parseInt(br.readLine());
				System.out.println("Element to be Searched = " + item);
				beg = 0;
				end = n - 1;
				mid = (beg + end) / 2;
				while (beg <= end && item != a[mid]) {
					if (item > a[mid])
						beg = mid + 1;
					else
						end = mid - 1;

					mid = (beg + end) / 2;
				}
				if (a[mid] == item)
					System.out.println("Element Found\n");
				else
					System.out.println("Element Not Found\n");
				break;
			default:
				System.out.println("Invalid Choice\n");
				break;
			}
			System.out.println("\n\nDo you want to Continue");
			System.out.println("\nType '1' to Continue");
			System.out.println("\nEnter '2' to Exit\n");
			choice = Integer.parseInt(br.readLine());
		} while (choice == 1);

	}

}
