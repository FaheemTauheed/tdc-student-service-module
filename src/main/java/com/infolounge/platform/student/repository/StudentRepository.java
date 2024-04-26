package com.infolounge.platform.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infolounge.platform.student.entity.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
