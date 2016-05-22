package com.hcl.manish.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String EmpId;
	private String EmpFName;
	private String EmpLName;
	private String Department;
	private Address address;
	
	@Id
	@Column(name = "empno")
	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	@Column(name = "empFname")
	public String getEmpFName() {
		return EmpFName;
	}

	public void setEmpFName(String empFName) {
		EmpFName = empFName;
	}

	@Column(name = "empLname")
	public String getEmpLName() {
		return EmpLName;
	}

	public void setEmpLName(String empLName) {
		EmpLName = empLName;
	}

	@Column(name = "dept")
	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	@Embedded
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
