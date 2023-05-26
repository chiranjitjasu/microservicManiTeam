/**
 * 
 */
package com.mycom.EmployeeManager.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @author 1028654
 *
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {

	BUSINESS_ERROR("1"),TECHNICAL_ERROR("2"),SUCCESS("0");
	
	String value;
	
}
