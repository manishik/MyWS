package com.hcl;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "EmpID")
	private int empID;
	
	@Column(name = "EmpFName")
	private String empFName;
	
	@Column(name = "EmpSName")
	private String empSName;
	
	@Column(name = "EmpLName")
	private String empLName;
	
	@Column(name = "DeptNo")
	private int departmentNo;
	
	@Column(name = "Salary")
	private double salary;
	
	@Column(name = "EmpAddress")
	private String address;
	
	@Column(name = "HireDate")
	private Date hireDate;
	
	@Column(name = "Manager")
	private String manager;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpFName() {
		return empFName;
	}
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	public String getEmpSName() {
		return empSName;
	}
	public void setEmpSName(String empSName) {
		this.empSName = empSName;
	}
	public String getEmpLName() {
		return empLName;
	}
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}

}
