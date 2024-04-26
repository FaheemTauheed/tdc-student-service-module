package com.infolounge.platform.student.model;

import lombok.Data;

@Data
public class StudentAddressModel {
	
	/**
	 * 
	 */
	private static final long serialversionUID = 1L;
	
	
	private Integer addId;

	private String city;

	private String state;

	private String country;

	private String pin;

}
