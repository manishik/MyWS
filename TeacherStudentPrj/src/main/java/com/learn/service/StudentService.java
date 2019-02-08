package com.learn.service;

import org.springframework.stereotype.Service;

import com.learn.model.Student;

/**
 * @author manishkeshav
 *
 */

@Service
public interface StudentService {

	public Student createStudent(Student student);

	public Student retrieveStudent(int studentId);

	public Student updateStudent(Student student);

	public Student deleteStudent(int studentId);

}
