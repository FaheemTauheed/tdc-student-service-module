package com.infolounge.platform.student.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infolounge.platform.student.entity.StudentEntity;
import com.infolounge.platform.student.model.StudentModel;
import com.infolounge.platform.student.service.StudentServiceImpl;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentServiceImpl service;
	
	@PostMapping("/add")
	public String insertStudent(@RequestBody StudentModel student) {
		
		return service.addStudent(student);
		
	}
	@GetMapping("/get")
	public List<StudentModel> fetchAllStudent(){
		
		return service.getAll();
		
	}

}
