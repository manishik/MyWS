package com.citi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DailyJobTaskImpl {

	HashMap<String, ArrayList<String>> agendaMap = new HashMap<String, ArrayList<String>>();
	ArrayList<String> internalLegalList = new ArrayList<String>();
	ArrayList<String> iLL = new ArrayList<String>();

	ArrayList<TradeSearchResult> matchedTradesArray = new ArrayList<TradeSearchResult>();

	String tradeId = null;
	StringBuilder finalResult = new StringBuilder();

	Date startTime = new Date();
	Date endTime = new Date();
	
	HashMap<String, Calendar> jobExeTimeMap = new HashMap<String, Calendar>();

	public static void main(String[] args) {
		DailyJobTaskImpl dailyJobTaskImpl = new DailyJobTaskImpl();
		dailyJobTaskImpl.method();
	}
	
	
	void method(){
	
		long l1 = System.currentTimeMillis();
		long timee = l1 / 1000;
		String seconds = Integer.toString((int) (timee % 60));
		System.out.println("Seconds Before : " + seconds);

		moveConfirmations(); 						//Call the Business Method

		long l2 = System.currentTimeMillis();
		long ti = l2 / 1000;
		String secnds = Integer.toString((int) (ti % 60));
		System.out.println("Seconds After : " + secnds);
		
		generateEmailBody();
		
		System.out.println("Time Difference = " + (l2 - l1) / 1000 + " Seconds");
	}

	void moveConfirmations() {

		/*//Logging mechanism 
		final Logger logger = Logger.getLogger(DailyJobTaskImpl.class);
		DOMConfigurator.configure("LogConfig.xml");*/
		
		setter();

		for (String agendToRun : agendaMap.keySet()) {
			internalLegalList = agendaMap.get(agendToRun);
			
			finalResult.append("Agenda to Run : "+ agendToRun + "\n");

			finalResult.append("Executing Agenda "+agendToRun);
			Calendar c1 = Calendar.getInstance();
			jobExeTimeMap.put("Start Time", c1);
			for (int i = 0; i < 5; i++) { // i<5 so 5 seconds
				try {
					Thread.sleep(1000); // One Second
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finalResult.append(".");
			}
			
			for (String legalEntity : internalLegalList) {
				finalResult.append("\n" + legalEntity + "\n");
				finalResult.append("Trades Affected : " + "\n");
				for (int i = 0; matchedTradesArray.size() > 0
						&& i < matchedTradesArray.size(); i++) {
					tradeId = matchedTradesArray.get(i).getTradeId().toString();
					finalResult.append("\t" + tradeId + "\n");
				}
			}
			
			Calendar c2 = Calendar.getInstance();
			jobExeTimeMap.put("End Time", c2);
			/*try {
				Double d = Math.random() * 10000;
				System.out.println("Ramdom Value = "+d.intValue());
				Thread.sleep(d.intValue());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println(finalResult);
		//logger.info(finalResult);
	}

	void setter() {
		internalLegalList.add("CitiGroup Energy Inc");
		internalLegalList.add("CitiGroup Energy Canada");
		internalLegalList.add("Citi Bank North America");

		iLL.add("CitiGroup Market Ltd");
		iLL.add("CitiGroup Market Ltd 2");

		agendaMap.put("Rule 1", internalLegalList);
		agendaMap.put("Rule 2", iLL);

		TradeSearchResult tradeSearchResult = new TradeSearchResult();
		TradeSearchResult tradeSearchResult1 = new TradeSearchResult();
		TradeSearchResult tradeSearchResult2 = new TradeSearchResult();
		tradeSearchResult.setTradeId("Trade1");
		tradeSearchResult1.setTradeId("Trd1");
		tradeSearchResult2.setTradeId("Td1");

		matchedTradesArray.add(tradeSearchResult);
		matchedTradesArray.add(tradeSearchResult1);
		matchedTradesArray.add(tradeSearchResult2);
	}
	
	public String generateEmailBody() {
		StringBuffer sb1 = new StringBuffer();
		if (jobExeTimeMap != null) {
			Set<String> keys = jobExeTimeMap.keySet();
			for (Iterator<String> i = keys.iterator(); i.hasNext();) {
				String key = i.next();
				
				if(key.equalsIgnoreCase("Start Time")){
					Calendar calendar = jobExeTimeMap.get(key);
					System.out.print(key + " = ");
					System.out.println("Hours:" + calendar.get(Calendar.HOUR_OF_DAY)
							+ " Minutes:" + calendar.get(Calendar.MINUTE)
							+ " Seconds:" + calendar.get(Calendar.SECOND));
				}
				
				System.getProperty("line.separator");
				
				if(key.equalsIgnoreCase("End Time")){
					Calendar calendar = jobExeTimeMap.get(key);
					System.out.print(key + " = ");
					System.out.println("Hours:" + calendar.get(Calendar.HOUR_OF_DAY)
							+ " Minutes:" + calendar.get(Calendar.MINUTE)
							+ " Seconds:" + calendar.get(Calendar.SECOND));
				}
			}
		}
		return sb1.toString();
	}
	
}
