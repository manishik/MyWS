package com.citi;

public class ThreadManager {

	public static void main(String[] m) {
		
		int resultA = new TradeContext().moveTrades(50);
		System.out.println("resultA = "+resultA);
		
	}
}


