package com.learn.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author manishkeshav
 *
 */

@Component
@Getter
@Setter
public class Teacher {

	private StringBuffer teacherFName;
	private StringBuffer teacherLName;
	private int teacherId;
	private StringBuffer teachClass;
	private List<String> teachSubjects;

}
