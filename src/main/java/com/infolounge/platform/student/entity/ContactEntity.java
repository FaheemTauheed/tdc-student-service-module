package com.infolounge.platform.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ContactEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySequenceGenerator2")
	@SequenceGenerator(name = "mySequenceGenerator2", sequenceName = "MY_SEQUENCE2",initialValue = 1000, allocationSize = 1)
	@Column(name = "C_Id")
	private Integer cid;

	@Column(name = "")
	private String emailId;

	@Column(name = "")
	private String website;

	@Column(name = "")
	private Long phoneNo;

	@Column(name = "")
	private Long altPhoneNo;

	private Integer studentid;

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", emailId=" + emailId + ", website=" + website + ", phoneNo=" + phoneNo
				+ ", altPhoneNo=" + altPhoneNo + "]";
	}

}
