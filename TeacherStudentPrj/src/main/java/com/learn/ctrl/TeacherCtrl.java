package com.learn.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Teacher;

/**
 * @author manishkeshav
 *
 */

@RestController
@RequestMapping(path = "/teacher")
public class TeacherCtrl {

	/* Teacher CRUD */
	@RequestMapping
	public Teacher createTeacher(Teacher teacher) {
		Teacher teacherr = new Teacher();

		return teacherr;
	}

	@RequestMapping
	public Teacher retrieveTeacher(int teacherId) {
		Teacher teacher = new Teacher();

		return teacher;
	}

	@RequestMapping
	public Teacher updateTeacher(Teacher teacher) {
		Teacher teacherr = new Teacher();

		return teacherr;
	}

	@RequestMapping
	public Teacher deleteTeacher(int teacherId) {
		Teacher teacherr = new Teacher();

		return teacherr;
	}

}
