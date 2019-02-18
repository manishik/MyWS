package com.javaInterview.interviewQs;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> premiumPhone = new ConcurrentHashMap<String, String>();
		premiumPhone.put("Apple", "iPhone 7 Plus");
		premiumPhone.put("HTC", "HTC One");
		premiumPhone.put("Samsung", "S7");

		Iterator iterator = premiumPhone.keySet().iterator();

		//adding new object while iterating a collection 
		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
		
		Iterator iterator2 = premiumPhone.keySet().iterator();
		System.out.println("PremiumPhones : ");
		while (iterator2.hasNext()) {
			System.out.print(premiumPhone.get(iterator2.next()) + "\t");
		}
	}
}


/*
										Fail Fast Iterator  		Fail Safe Iterator

Throw ConcurrentModification Exception 	Yes 						No 
Clone object  							No 							Yes 
Memory Overhead 						No 							Yes 
Examples 								HashMap,Vector,				CopyOnWriteArrayList, ConcurrentHashMap
										ArrayList,HashSet 
*/