package com.hp;

import javax.naming.InitialContext;

public class EJBClient {
	public static void main(String[] args) {
		try {

			System.setProperty("java.naming.provider.url",
					"jnp://localhost:1099");
			System.setProperty("java.naming.factory.initial",
					"org.jnp.interfaces.NamingContextFactory");
			InitialContext ctx = new InitialContext();
			
			StudentFacade stuf = (StudentFacade) ctx.lookup("StuBean/remote");
			Student s1 = new Student();
			s1.setRule_Id(1111);
			s1.setRule_type("A");
			System.out.println("==="+s1.getRule_Id());
			stuf.addStudent(s1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}