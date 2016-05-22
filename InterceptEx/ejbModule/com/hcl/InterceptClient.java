package com.hcl;

import javax.naming.InitialContext;

public class InterceptClient {
	
	public static void main(String[] args) {
		try {
			System.setProperty("java.naming.provider.url",
					"jnp://localhost:1099");
			System.setProperty("java.naming.factory.initial",
					"org.jnp.interfaces.NamingContextFactory");
			InitialContext ctx = new InitialContext();
						
			//Can look up both Local and Remote
			IRemote remote = (IRemote) ctx.lookup("interception/remote");
			//ILocal local = (ILocal) ctx.lookup("interception/local");
			
			System.out.println("Multiply Result for remote = "+remote.multiplier(6, 4));
			//System.out.println("Multiply Result for local = "+local.multiplier(8, 4));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
