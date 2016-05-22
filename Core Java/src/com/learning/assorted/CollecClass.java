package com.learning.assorted;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollecClass {
	
	public CollecClass(){
		
	}

	public static void main(String[] args) {
		
		System.out.println("Hey in public main()");
	
		Employee emp1 = new Employee();
				
		Map userInfo = new HashMap();
		userInfo.put("K1", emp1);

		for(int i=0;i<userInfo.size();i++)
		{
			Employee emp2=(Employee)userInfo.get("K1");
			System.out.println(emp2.userName);
		}
		
		main(3);
		
		
		Set<Employee> set1 = new HashSet<Employee>();
		set1.add(emp1);
		Iterator ite1 = set1.iterator();
		while(ite1.hasNext()){
			Employee em1 = (Employee)ite1.next();
			System.out.println("EmpId = "+em1.userName);
		}
		
		
	}
	
	private static void main(int args){
		System.out.println("Hey in private main() "+args);
	}
	
	public static void main(String s){
		System.out.println("Hey in main()");
	}

}

class Employee {
	
	public String userName = "Manish";
	public String password = "Heybabe";

}

