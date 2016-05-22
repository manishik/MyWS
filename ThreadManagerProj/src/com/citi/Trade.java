package com.citi;

public class Trade implements Runnable {

	int tradeCount;
	
	public Trade() {
	}	
	
	public Trade(int noOfTrades) {
		tradeCount = noOfTrades;
	}

	public int getTradeCount() {
		return tradeCount;
	}
	
	public void run() {
		System.out.println("run");
	}

}
