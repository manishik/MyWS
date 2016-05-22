package com.hcl;

import javax.naming.InitialContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JTest {

	EmployeeFacade empf;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("java.naming.provider.url",
				"jnp://localhost:1099");
		System.setProperty("java.naming.factory.initial",
				"org.jnp.interfaces.NamingContextFactory");
		InitialContext ctx = new InitialContext();
		
		empf = (EmployeeFacade) ctx.lookup("EmpBean/remote");
	}

	@Test
	public void testAddEmp() {
		Employee e1 = new Employee();
		e1.setEmpID(2);
		e1.setEmpFName("Manish");
		e1.setEmpLName("Indudhar");
		e1.setDepartmentNo(100);
		System.out.println("F Name = "+e1.getEmpFName());
		empf.addEmp(e1);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
