package com.infolounge.platform.student.model;

import java.io.Serializable;
import java.util.Date;

import com.infolounge.platform.student.entity.ContactEntity;
import com.infolounge.platform.student.entity.StudentAddressEntity;

import lombok.Data;

@Data
public class StudentModel implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialversionUID = 1L;
	
	
	
	private Integer stuId;

	private String studentName;

	private Integer stuTypeId;
	
	private StudentAddressEntity address;

	private ContactEntity contact;

	/*
	 *  private Integer branchId;
	 */

	// private byte[] pic;

	/*
	 *  private Date anniversary;
	 */

	/*
	 * private Integer courseId;
	 */

	
	private Date birthday;

	private Date createDate;

	private String createdBy;
	
}
