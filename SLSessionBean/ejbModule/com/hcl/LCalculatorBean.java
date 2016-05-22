package com.hcl;

import javax.annotation.PostConstruct;
import javax.ejb.Remove;
import javax.ejb.Stateless;
import com.hcl.LCalculator;

@Stateless(name = "Calci")

public class LCalculatorBean implements LCalculator {
	
	//Business Method
	public int add(int a, int b) {
		System.out.println("Before Add");
		int c = a+b;
		System.out.println("After Add");
		return c;
	}
	
	@PostConstruct
	public void eCreate()
	{
		System.out.println("Entered into Create");
	}
	@Remove
	public void eRemove()
	{
		System.out.println("Entered into Remove");
	}
}
