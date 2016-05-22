package com.hcl;

import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateless;
import com.hcl.Calculator;

@Stateless(name="Calc")
public class CalculatorBean implements Calculator {

	public int add(int a, int b) {
		int c = a + b;
		System.out.println("Result = "+c);
		return c;
	}
	
	@PostConstruct
	public void eMake()
	{
		System.out.println("Entered into Create");
	}
	
	@Remove
	public void eRemove()
	{
		System.out.println("Entered into Remove");
	}

}
