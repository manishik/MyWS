package com.hcl;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import com.hcl.Calculator;

public class SLSBTest {
	/*@EJB
	private static Calculator cal;*/
	
	public static void main(String[] args) {
		try {
			System.setProperty("java.naming.provider.url",
					"jnp://localhost:1099");
			System.setProperty("java.naming.factory.initial",
					"org.jnp.interfaces.NamingContextFactory");
			InitialContext ctx = new InitialContext();
			Calculator tb = (Calculator) ctx.lookup("Calc/remote");
			System.out.println("Result :: " + tb.add(330, 200));
			
			/*cal.add(200, 100);*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
