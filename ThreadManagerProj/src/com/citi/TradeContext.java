package com.citi;

public class TradeContext implements ITradeMovement {

	private int tradeCount;

	private ITradeMovement movement;
	private MoveMoreTrades moreTrades = new MoveMoreTrades();
	private MoveAvgTrades avgTrades = new MoveAvgTrades();
	private MoveLessTrades lessTrades = new MoveLessTrades();

	/*
	 * public TradeContext(int noOfTrades) { this.tradeCount = noOfTrades; }
	 */

	public int moveTrades(int noOfTrades) {
		this.tradeCount = noOfTrades; //Has to be done in a Setter method //variable tradeCount not required too
		if (tradeCount < 100) {
			return lessTrades.moveTrades(tradeCount);
		} else {
			if (tradeCount < 200) {
				return avgTrades.moveTrades(tradeCount);
			} else {
				return moreTrades.moveTrades(tradeCount);
			}
		}
	}

}
