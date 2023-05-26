package com.mycom.EmployeeManager.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "Employee_poc_test")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPOYEE_TEST_ID_SEQ")
	@SequenceGenerator(sequenceName = "EMPOYEE_TEST_ID_SEQ", allocationSize = 1, name = "EMPOYEE_TEST_ID_SEQ")
	private Long id;
	private String name;
	private Double salary;
	/*
	 * @OneToMany(mappedBy="emp",cascade = CascadeType.ALL, orphanRemoval = true)
	 * private List<ContactEntity> contacts;
	 */

}
