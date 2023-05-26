/**
 * 
 */
package com.mycom.EmployeeManager.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author 1028654
 *
 */
@Data
@Entity
@Table(name = "Employee_poc_test_contact")
public class ContactEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPOYEE_TEST_ID_SEQ")
	@SequenceGenerator(sequenceName = "EMPOYEE_TEST_ID_SEQ", allocationSize = 1, name = "EMPOYEE_TEST_ID_SEQ")
	private Long id;
	private String name;
	private String relation;
	private String address;
	private String emailId;
	private long mobileNumber;
	/*
	 * @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 * 
	 * @JoinColumn(name = "empId") private EmployeeEntity emp;
	 */
}
