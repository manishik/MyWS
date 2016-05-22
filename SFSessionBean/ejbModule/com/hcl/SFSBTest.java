package com.hcl;

import javax.naming.InitialContext;

import com.hcl.SFCalc;

public class SFSBTest {
	public static void main(String[] args) {
		try {

			System.setProperty("java.naming.provider.url",
					"jnp://localhost:1099");
			System.setProperty("java.naming.factory.initial",
					"org.jnp.interfaces.NamingContextFactory");
			InitialContext ctx = new InitialContext();
			SFCalc tb = (SFCalc) ctx.lookup("calc/remote");
			System.out.println("Result of add = " + tb.add(9, 8));
			System.out.println("Result of sub = " + tb.sub());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}