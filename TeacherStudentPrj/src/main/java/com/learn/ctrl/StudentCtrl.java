package com.learn.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Student;

/**
 * @author manishkeshav
 *
 */

@RestController
@RequestMapping(path = "/student")
public class StudentCtrl {

	/* Student CRUD */
	@RequestMapping
	public Student createStudent(Student student) {
		Student stu = new Student();

		return stu;
	}

	@RequestMapping
	public Student retrieveStudent(int studentId) {
		Student student = new Student();

		return student;
	}

	@RequestMapping
	public Student updateStudent(Student student) {
		Student stu = new Student();

		return stu;
	}

	@RequestMapping
	public Student deleteStudent(int studentId) {
		Student stu = new Student();

		return stu;
	}

}
