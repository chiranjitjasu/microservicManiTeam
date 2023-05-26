package com.mycom.EmployeeManager.dto.employee;

import lombok.Data;


@Data
public class ContactDto {

	private Long id;
	private String name;
	private String relation;
	private String address;
	private String emailId;
	private long mobileNumber;
	//private EmployeeDTO emp;
	
}