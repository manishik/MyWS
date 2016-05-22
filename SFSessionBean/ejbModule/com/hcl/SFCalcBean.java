package com.hcl;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.SessionContext;
import javax.ejb.Stateful;
import com.hcl.SFCalc;
import com.learning.IMD;

@Stateful(name = "calc")
public class SFCalcBean implements SFCalc {
	
	@Resource
	SessionContext ctx;
	
	//Instance variables 
	private int a;
	private int b;
	
	//Dependency Injection
	@EJB
	private IMD muldiv;
	
	//Business Methods
	public int add(int a, int b) {
		System.out.println("Inside add");
		System.out.println("Invoked interface:::" +ctx.getInvokedBusinessInterface());
		this.a = a;
		this.b = b;
		muldiv.multiply(a, b);//Calling the method of injected bean
		muldiv.divide();//Calling the method of injected bean
		return a+b;
	}

	public int sub() {
		System.out.println("Inside sub");
		return a - b;
	}

	//Container Call back Methods or Life Cycle Methods
	//Used if required 
	@PostConstruct
	public void make() {
		System.out.println("Bean created ");
	}

	@PostActivate
	public void trigger() {
		System.out.println("Bean activated");
	}

	@PrePassivate
	public void serialize() {
		System.out.println("Bean passivated");
	}
	
	@Remove
	public void takeOut() {
		System.out.println("Bean removed");
	}
	
}
