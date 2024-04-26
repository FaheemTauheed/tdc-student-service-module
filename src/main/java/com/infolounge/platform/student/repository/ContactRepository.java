package com.infolounge.platform.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infolounge.platform.student.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

}
