package com.learning.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestStr {

	public static void main(String[] args) {
		
		List<String> listofString = new ArrayList<String>(); 
		listofString.add("Ser1#Op11");
		listofString.add("Ser1#Op12");
		listofString.add("Ser1#Op13");
		listofString.add("Ser2#Op1");
		listofString.add("Ser2#Op2");
		listofString.add("Ser2#Op3");
		
		String serOp = null;
		Set<String> onlyServiceIds = new HashSet<String>();
		List onlyOperationIds = new ArrayList();
		
		for(int i=0;i<listofString.size();i++){
			serOp = listofString.get(i);
			//System.out.println("ServiceOp = " + serOp);
			
			String serId = serOp.substring(0,serOp.indexOf("#"));
			/*for(String s1 : serOps){
				System.out.println(s1);
				onlyServiceIds.add(s1);
			}*/
			//System.out.println("serId = "+serId);
			
			String serId1 = serOp.split("#")[0];
			System.out.println("serId1  = "+serId1);
			onlyServiceIds.add(serId1);
			
			String opId = serOp.split("#")[1];
			//System.out.println("opId  = "+opId);
			onlyOperationIds.add(opId);
		}
		
		Iterator servIt = onlyServiceIds.iterator();
		while(servIt.hasNext()){
			String sId = (String)servIt.next();
			System.out.println("Service Id's in Set = "+sId);
		}
		
		Iterator opIt = onlyOperationIds.iterator();
		while(opIt.hasNext()){
			String oId = (String)opIt.next();
			System.out.println("Op Id's in List = "+oId);
		}
		
	}
}
