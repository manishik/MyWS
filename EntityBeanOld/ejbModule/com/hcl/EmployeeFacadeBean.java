package com.hcl;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

@Stateless(name = "EmpBean")
@TransactionManagement(value = TransactionManagementType.BEAN)

public class EmployeeFacadeBean implements EmployeeFacade {

	@PersistenceContext(name = "EmployeePC")
	EntityManager em;
	
	@Resource UserTransaction tx;
	
	public void addEmp(Employee emp) {
		try {
			System.out.println("Inside add emp method");
			tx.begin();
			em.persist(emp);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Employee getEmp(String empId) {
		System.out.println("Inside get emp method");
		System.out.println("Entity:" + em);
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
