package com.learning.Collection.List;

import java.util.List;

public class P1 {

	public static void main(String[] args) {

		List<String> list = null;

		if (list != null) {
			System.out.println("List not is not empty");
		} else {
			System.out.println("Please initialize the List");
		}

		/*
		  if (list == null || list.isEmpty()) { //isEmpty method will bomb at
		  										//runtime with NullPointerException if list is not initialized
		  	System.out.println("List is null"); 
		  }
		  else { 
		  	System.out.println("List has some elements");
		  }
		*/
	}
}
