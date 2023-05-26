package com.mycom.EmployeeManager.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "EmployeeContactPOC")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeContact {
       private String mobileNumber;
       @Id
       private Long id;
       private Double emailAddress;
      // private List ContactList;
       
	
       
}