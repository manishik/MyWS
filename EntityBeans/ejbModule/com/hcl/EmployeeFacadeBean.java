package com.hcl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "EmpBean")

public class EmployeeFacadeBean implements EmployeeFacade {

	@PersistenceContext(unitName  = "EmployeeLapTop")
	private EntityManager em;
	
	public void addEmp(Employee emp) {
		try {
			System.out.println("Inside add emp method");
			em.persist(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Employee getEmp(int empId) {
		System.out.println("Inside get emp method");
		return em.find(Employee.class, empId);
	}

	public Employee updateEmp(Employee emp) {
		System.out.println("Inside updateEmp method");
		return em.merge(emp);
	}

	public void deleteEmp(Employee emp) {
		System.out.println("Inside deleteEmp method");
		em.remove(emp);
	}

}
