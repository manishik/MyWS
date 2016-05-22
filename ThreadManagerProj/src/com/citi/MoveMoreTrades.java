package com.citi;

public class MoveMoreTrades implements ITradeMovement {
	public int moveTrades(int noOfTrades) {
		System.out.println("Moving lots of trades");
		System.out.println("Moving " + noOfTrades + " trades");
		return 1;
	}
}
