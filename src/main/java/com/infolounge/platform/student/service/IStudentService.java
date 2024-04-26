package com.infolounge.platform.student.service;

import java.util.List;

import com.infolounge.platform.student.entity.StudentEntity;
import com.infolounge.platform.student.model.StudentModel;

public interface IStudentService {
	
	String addStudent(StudentModel student);
	
	List<StudentModel> getAll();

}
