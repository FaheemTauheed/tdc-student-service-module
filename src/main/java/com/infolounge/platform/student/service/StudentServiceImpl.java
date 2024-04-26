package com.infolounge.platform.student.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infolounge.platform.student.entity.StudentEntity;
import com.infolounge.platform.student.model.StudentModel;
import com.infolounge.platform.student.repository.ContactRepository;
import com.infolounge.platform.student.repository.StudentAddressRepostory;
import com.infolounge.platform.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private StudentAddressRepostory studentaddressRepo;

	@Autowired
	private ContactRepository contactRepo;

	@Override
	public String addStudent(StudentModel student) {
		
		StudentEntity studentEntity = new StudentEntity();
		
		BeanUtils.copyProperties(student, studentEntity);
		
		return studentRepo.save(studentEntity).getStuId()+" Is Saved";
	}

	@Override
	public List<StudentModel> getAll() {
		
		List<StudentEntity> studentEntityList = studentRepo.findAll();
		
		return studentEntityList.stream().map(entity -> {
		                                       StudentModel model = new StudentModel();
		                                       BeanUtils.copyProperties(entity, model);
		                                       return model;
		                          }).collect(Collectors.toList());
	}

}
