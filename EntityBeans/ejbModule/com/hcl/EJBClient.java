package com.hcl;

import javax.naming.InitialContext;

public class EJBClient {
	
	public static void main(String[] args) {
		try {
			
			EJBClient ejbClient = new EJBClient();
			EmployeeFacade empf = ejbClient.loadAndLookUp();
			Employee e1 = new Employee();
			e1.setEmpID(1);
			e1.setEmpFName("Manish");
			e1.setEmpLName("Keshav");
			e1.setDepartmentNo(100);
			e1.setAddress("Bogadi, Mysore, India");
			/*Address a1 = new Address();
			a1.setDoorNo(1012);
			a1.setState("Karnataka");
			e1.setAddress(a1);*/
			//System.out.println("F Name = "+e1.getEmpFName());
			//empf.deleteEmp(e1);
			
			Employee e2 = empf.getEmp(1);
			System.out.println("Name = "+e2.getSalary()*12);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public EmployeeFacade loadAndLookUp() {
		EmployeeFacade empf = null;
		try {

			System.setProperty("java.naming.provider.url",
					"jnp://localhost:1099");
			
			System.setProperty("java.naming.factory.initial",
					"org.jnp.interfaces.NamingContextFactory");
			
			InitialContext ctx = new InitialContext();

			empf = (EmployeeFacade) ctx.lookup("EmpBean/remote");
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return empf;
	}

}