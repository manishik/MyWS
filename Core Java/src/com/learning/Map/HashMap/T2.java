package com.learning.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T2 {
	public static void main(String[] args) {
		System.out.println("inside main");
		T2 t2 = new T2();
		t2.aMethod();
	}

	void aMethod() {
		HashMap<String, String> tM = null;
		MoveTradesRunnable moveTradesRunnable = new MoveTradesRunnable(
				"Agenda1", "t1");

		moveTradesRunnable.setMethod();
		moveTradesRunnable.runMethod();

		// System.out.println("Finally the result = " + tM.get("Agenda1"));
	}
}

class MoveTradesRunnable {
	private HashMap<String, String> tradesMoved = new HashMap<String, String>();
	private String tradeID;
	private String agendaGroup;
	ArrayList<String> tradeIdList = new ArrayList<String>();

	List<String> listOfMatchedtrades = new ArrayList<String>();
	
	public MoveTradesRunnable(String tradeID, String agendaGroup) {
		this.tradeID = tradeID;
		this.agendaGroup = agendaGroup;
	}

	void setMethod(){
		listOfMatchedtrades.add("t1");
		listOfMatchedtrades.add("t2");
		listOfMatchedtrades.add("t3");
		listOfMatchedtrades.add("t4");
		listOfMatchedtrades.add("t5");
		agendaGroup = "Agenda1";
	}
	
	public void runMethod() {

		for (int z = 0; z < listOfMatchedtrades.size(); z++) {
			tradesMoved = rule();

			System.out.println("Size = " + tradesMoved.size());

			tradeIdList.add(tradesMoved.get("Agenda1"));

			for (String s1 : tradeIdList) {
				System.out.println("List of Trades = " + s1);
			}
		}
	}

	public HashMap<String, String> rule() {
		// Only returns HashMap
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Agenda1", "Trade1");
		hashMap.put("Agenda1", "Trade2");
		hashMap.put("Agenda1", "Trade3");
		hashMap.put("Agenda1", "Trade4");
		hashMap.put("Agenda2", "Tr1");
		hashMap.put("Agenda2", "Tr2");
		return hashMap;
	}

}