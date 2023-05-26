package com.mycom.EmployeeManager.dto.employee;


import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.mycom.EmployeeManager.entities.ContactEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
	@NotEmpty(message = "")
	private String name;
    private Long id;
    @NotEmpty(message = "")
    private Double salary;
   // private List<ContactDto> contacts;
	
    
	
	
}
