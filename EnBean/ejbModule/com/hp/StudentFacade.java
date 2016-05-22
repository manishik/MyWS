package com.hp;

import javax.ejb.Remote;

@Remote public interface StudentFacade 
{
	public void addStudent(Student stu);

	public Student getStudent(String stuId);

	public Student updateStudent(Student stu);

	public void deleteStudent(Student stu);
}
