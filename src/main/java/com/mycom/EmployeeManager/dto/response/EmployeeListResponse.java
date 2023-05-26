/**
 * 
 */
package com.mycom.EmployeeManager.dto.response;

import java.util.List;

import com.mycom.EmployeeManager.dto.employee.EmployeeDTO;
import com.mycom.EmployeeManager.dto.enums.ResponseCodeEnum;

import lombok.Data;

/**
 * @author 1028654
 *
 */
@Data
public class EmployeeListResponse extends BaseResponse {

	
	

	private Object employees; 
	public EmployeeListResponse(ResponseCodeEnum status,Object employees) {
		super(status);
		this.employees=employees;
		// TODO Auto-generated constructor stub
	}
}
