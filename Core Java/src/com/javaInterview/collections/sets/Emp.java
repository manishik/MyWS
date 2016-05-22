package com.javaInterview.collections.sets;

public class Emp {

	private int id;
	private String name;
	private int deptId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String toString() {
		return "Emp Name = " + name + " Emp Id = " + id + " Emp DeptId = " + deptId;
	}

}
