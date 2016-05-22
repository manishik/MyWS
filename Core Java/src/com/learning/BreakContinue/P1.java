package com.learning.BreakContinue;

public class P1 {

	public static void main(String[] args) {
		
		print:for (int i = 0; i < 10; i++) { 
			
			System.out.println(i); 
			if(i==5)
				break print;
			
			//continue; 
		 }
		 

/*		for (int i = 0; i < 10; i++) {
			if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
				// System.out.println("");
			} else {
				System.out.println(i);
			}
		}*/
	}

}