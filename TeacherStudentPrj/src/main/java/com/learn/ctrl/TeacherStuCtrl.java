package com.learn.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Student;
import com.learn.model.Teacher;

/**
 * @author manishkeshav
 *
 */

@RestController
@RequestMapping(path = "/teacherStu")
public class TeacherStuCtrl {

	/* Teacher Student */
	@RequestMapping
	public Student getStudent(int teacherId) {
		Student student = new Student();

		return student;
	}

	@RequestMapping
	public Teacher getTeacher(int studentId) {
		Teacher teacher = new Teacher();

		return teacher;
	}

}
