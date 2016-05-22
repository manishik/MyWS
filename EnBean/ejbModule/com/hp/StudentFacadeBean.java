package com.hp;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "StuBean")
@TransactionManagement(value = TransactionManagementType.CONTAINER)
public class StudentFacadeBean implements StudentFacade {

	@PersistenceContext(name = "StudentPC")
	EntityManager em;

	public void addStudent(Student emp) {
		System.out.println("Inside add Student method");
		em.persist(emp);
	}

	public Student getStudent(String empId) {
		System.out.println("Inside get Student method");
		System.out.println("Entity:" + em);
		return em.find(Student.class, empId);
	}

	public Student updateStudent(Student emp) {
		System.out.println("Inside updateStudent method");
		return em.merge(emp);
	}

	public void deleteStudent(Student emp) {
		System.out.println("Inside deleteStudent method");
		em.remove(emp);
	}

}
