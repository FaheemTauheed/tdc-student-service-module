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
public class StudentAddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySequenceGenerator1")
	@SequenceGenerator(name = "mySequenceGenerator1", sequenceName = "MY_SEQUENCE1",initialValue = 100, allocationSize = 1)
	@Column(name = "Add_Id")
	private Integer addId;

	@Column(name = "")
	private String city;

	@Column(name = "")
	private String state;

	@Column(name = "")
	private String country;

	@Column(name = "")
	private String pin;

	@Override
	public String toString() {
		return "StudentAddress [addId=" + addId + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pin=" + pin + "]";
	}

}
