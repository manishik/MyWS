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
public class Student {

	private StringBuffer studentFName;
	private StringBuffer studentLName;
	private int studentId;
	private StringBuffer studentClass;
	private List<String> studentSubjects;

}
