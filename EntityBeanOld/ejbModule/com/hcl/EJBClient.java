package com.hcl;

import javax.naming.InitialContext;

public class EJBClient {
	public static void main(String[] args) {
		try {

			System.setProperty("java.naming.provider.url",
					"jnp://localhost:1099");
			System.setProperty("java.naming.factory.initial",
					"org.jnp.interfaces.NamingContextFactory");
			InitialContext ctx = new InitialContext();
			
			EmployeeFacade empf = (EmployeeFacade) ctx.lookup("EmpBean/remote");
			Employee e1 = new Employee();
			e1.setEmpId("1");
			e1.setEmpFName("Manish");
			e1.setEmpLName("Indudhar");
			e1.setDepartment("Penstock");
			Address a1 = new Address();
			a1.setDoorNo(1012);
			a1.setState("Karnataka");
			e1.setAddress(a1);
			System.out.println("F Name = "+e1.getEmpFName());
			empf.addEmp(e1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}