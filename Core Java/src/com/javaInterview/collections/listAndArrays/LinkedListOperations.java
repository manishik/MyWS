package com.javaInterview.collections.listAndArrays;

import java.util.LinkedList;

public class LinkedListOperations {
	public static void main(String[] a) {

		// Linked List of String
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Five");
		linkedList.add("Three");
		linkedList.add("One");
		linkedList.add("Four");
		linkedList.add("Four");// Duplicate
		linkedList.add("Two");
		linkedList.add("Eight");
		linkedList.add("Four");// Duplicate
		
		//methods particular to LinkedList
		linkedList.addFirst("Zero");
		linkedList.addLast("Biggest Number");
		
		linkedList.add(2, "Six"); //add at a particular index position 
		
		System.out.println("Linked List = "+linkedList);
		
		System.out.println("Linked List first element = "+linkedList.getFirst());
		System.out.println("Linked List last element = "+linkedList.getLast());
		
		System.out.println("Linked List first element = "+linkedList.peek());
		System.out.println("Linked List first element = "+linkedList.peekFirst());
		System.out.println("Linked List Last element = "+linkedList.peekLast());
		System.out.println("Linked List first element = "+linkedList.poll());
		
		//Just the usual below
		
		// Iterate over the list in classic style
		System.out.print("Classic Style = ");
		for (int i = 0; i < linkedList.size(); i++) {
			String string = linkedList.get(i); //No cast needed
			System.out.print(string+" ");
		}

		// Iterate over the list in classic style to get the Fifth element
		String str = linkedList.get(5); // No need to cast since list is generic by
									// type
		System.out.println();
		System.out.println("Fifth element in List = " + str);

		// Iterate over the list using new for loop
		System.out.print("The new for loop = ");
		for (String str1 : linkedList) {
			System.out.print(str1+" ");
		}

	}
}
