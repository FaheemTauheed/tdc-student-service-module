package com.infolounge.platform.student.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContactModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialversionUID = 1L;
	
	
	private Integer cid;

	private String emailId;

	private String website;

	private Long phoneNo;

	private Long altPhoneNo;

	private Integer studentid;

	
	

}
