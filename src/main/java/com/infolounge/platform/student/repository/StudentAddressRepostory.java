package com.infolounge.platform.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infolounge.platform.student.entity.StudentAddressEntity;

public interface StudentAddressRepostory extends JpaRepository<StudentAddressEntity, Integer> {

}
