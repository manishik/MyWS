package com.hcl;

import javax.naming.InitialContext;

public class LSLSB {

	public static void main(String[] args) {
		try {
			System.setProperty("java.naming.provider.url", "jnp://localhost:1099");
			System.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
			InitialContext ctx = new InitialContext();
			LCalculator lc = (LCalculator) ctx.lookup("Calci/local");
			System.out.println("Result :: " + lc.add(300, 700));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
