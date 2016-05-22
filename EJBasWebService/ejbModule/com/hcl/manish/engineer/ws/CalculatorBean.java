package com.hcl.manish.engineer.ws;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hcl.manish.engineer.ws.ct.Employee;
import com.hcl.manish.interfaces.remote.Calculator;


@Stateless(name = "CalBean")
/*@WebService(wsdlLocation = "/META-INF/wsdl/Engineer.wsdl", 
			targetNamespace = "http://manish.hcl.com/engineer/ws", 
			portName="CalculatorBeanPort",
			serviceName = "Engineer", 
			name = "Engineer")*/
@WebService
public class CalculatorBean implements Calculator {

	@PersistenceContext(name = "EmployeePC")
	EntityManager em;
	
	public int add(int x, int y) {
		return x+y;
	}

	public double subtract(double x, double y) {
		return x-y;
	}
	
	public float multiply(float a, float b){
		return a*b;
	}

	public boolean addEmp(Employee emp) {
		try {
			System.out.println("Inside add employee method");
			em.persist(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public String getResult() {
		System.out.println("Hey just checking time = " + System.currentTimeMillis());
		return "Success***";
	}
}
