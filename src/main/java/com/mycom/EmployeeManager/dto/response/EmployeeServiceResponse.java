/**
 * 
 */
package com.mycom.EmployeeManager.dto.response;

import com.mycom.EmployeeManager.dto.employee.EmployeeDTO;
import com.mycom.EmployeeManager.dto.enums.ResponseCodeEnum;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 1028654
 *
 */
@Data
public class EmployeeServiceResponse extends BaseResponse{

	private String message;
	private EmployeeDTO employee; 
	
	/**
	 * @param status
	 * @param statusmsg
	 * @param errorcode
	 */
	public EmployeeServiceResponse(ResponseCodeEnum status,String message) {
		super(status);
		this.message=message;
	}
	
	public EmployeeServiceResponse(ResponseCodeEnum status) {
		super(status);
	}
	
	
	
	
	
}
