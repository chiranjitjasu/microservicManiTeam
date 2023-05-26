package com.mycom.EmployeeManager.dto.response;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mycom.EmployeeManager.dto.enums.ResponseCodeEnum;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseResponse {
	@JsonIgnore
	private ResponseCodeEnum status;
	private String statusmsg;
	private String statusCode;
	/**
	 * @param statuscode
	 * @param statusmsg
	 * @param errorcode
	 */
	public BaseResponse(ResponseCodeEnum status) {
		super();
		if(status==ResponseCodeEnum.BUSINESS_ERROR) {
			this.statusmsg = "Sorry we could not process the request. it is business error";
		}else if(status==ResponseCodeEnum.TECHNICAL_ERROR) {
			this.statusmsg = "Sorry we could not process the request. it is technical error";
		}else {
			this.statusmsg = "Transaction has been processed successfully";
		}
		this.statusCode = status.getValue();
	}
	
	


}
