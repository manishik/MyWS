package com.hcl;

import javax.ejb.Remote;

@Remote public interface EmployeeFacade 
{
	public void addEmp(Employee emp);

	public Employee getEmp(int empId);

	public Employee updateEmp(Employee emp);

	public void deleteEmp(Employee emp);
}
