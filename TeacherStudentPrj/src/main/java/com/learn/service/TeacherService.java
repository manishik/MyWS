package com.learn.service;

import org.springframework.stereotype.Service;

import com.learn.model.Teacher;

/**
 * @author manishkeshav
 *
 */

@Service
public interface TeacherService {

	public Teacher createTeacher(Teacher teacher);

	public Teacher retrieveTeacher(int teacherId);

	public Teacher updateTeacher(Teacher teacher);

	public Teacher deleteTeacher(int teacherId);

}
