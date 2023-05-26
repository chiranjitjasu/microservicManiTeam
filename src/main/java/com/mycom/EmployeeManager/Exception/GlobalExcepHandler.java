package com.mycom.EmployeeManager.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mycom.EmployeeManager.dto.enums.ResponseCodeEnum;
import com.mycom.EmployeeManager.dto.response.BaseResponse;
import com.mycom.EmployeeManager.dto.response.EmployeeServiceResponse;

@ControllerAdvice
public class GlobalExcepHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Object> handleBusinessException(Exception ex, WebRequest request) {

		EmployeeServiceResponse EmpserResp = new EmployeeServiceResponse(ResponseCodeEnum.BUSINESS_ERROR,
				ex.getMessage());
		return new ResponseEntity<Object>(EmpserResp, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(TechnicalException.class)
	public ResponseEntity<Object> handleTechnicalException(Exception ex, WebRequest request) {

		EmployeeServiceResponse EmpserResp = new EmployeeServiceResponse(ResponseCodeEnum.TECHNICAL_ERROR,
				ex.getMessage());
		return new ResponseEntity<Object>(EmpserResp, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request) {
		EmployeeServiceResponse EmpserResp = new EmployeeServiceResponse(ResponseCodeEnum.TECHNICAL_ERROR,
				ex.getMessage());
		return new ResponseEntity<Object>(EmpserResp, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
