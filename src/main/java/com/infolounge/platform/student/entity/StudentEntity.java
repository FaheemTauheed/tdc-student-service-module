package com.infolounge.platform.student.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "student_table")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySequenceGenerator")
	@SequenceGenerator(name = "mySequenceGenerator", sequenceName = "MY_SEQUENCE", allocationSize = 1)
	@Column(name = "STU_ID")
	private Integer stuId;

	@Column(name = "STU_NAME")
	private String studentName;

	@Column(name = "STU_TYPE")
	private Integer stuTypeId;

	@OneToOne(targetEntity = StudentAddressEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Add_IdFK") // fk column
	private StudentAddressEntity address;

	@OneToOne(targetEntity = ContactEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "C_IdFK") // fk column
	private ContactEntity contact;

	/*
	 * @Column(name = "") private Integer branchId;
	 */

	// private byte[] pic;

	/*
	 * @Column(name = "") private Date anniversary;
	 */

	/*
	 * @Column(name = "") private Integer courseId;
	 */

	@Column(name = "Birth_Date")
	private Date birthday;

	@Column(name= "CREATED_DATE", updatable=false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createDate;

	@Column(name = "Created_BY")
	private String createdBy;

	@Override
	public String toString() {
		return "StudentEntity [stuId=" + stuId + ", studentName=" + studentName + ", stuTypeId=" + stuTypeId
				+ ", address=" + address + ", contact=" + contact + ", birthday=" + birthday + ", createDate="
				+ createDate + ", createdBy=" + createdBy + "]";
	}

}
