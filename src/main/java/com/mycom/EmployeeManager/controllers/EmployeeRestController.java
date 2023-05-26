package com.mycom.EmployeeManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.EmployeeManager.Exception.BusinessException;
import com.mycom.EmployeeManager.dto.employee.EmployeeDTO;
import com.mycom.EmployeeManager.dto.enums.ResponseCodeEnum;
import com.mycom.EmployeeManager.dto.response.EmployeeListResponse;
import com.mycom.EmployeeManager.dto.response.EmployeeServiceResponse;
import com.mycom.EmployeeManager.services.EmployeeService;

@RestController
public class EmployeeRestController implements EmployeeAPI {
	@Autowired
	EmployeeService empser;

	@Override
	public ResponseEntity<EmployeeServiceResponse> createEmployee(@RequestBody EmployeeDTO employee)
			throws BusinessException {
		empser.createemployee(employee);

		return new ResponseEntity<EmployeeServiceResponse>(new EmployeeServiceResponse(ResponseCodeEnum.SUCCESS),
				HttpStatus.OK);
	}

	@Override
	public ResponseEntity<EmployeeServiceResponse> updateEmployeeById(@RequestBody EmployeeDTO empBody) {

		empser.updateEmployee(empBody);

		return new ResponseEntity<EmployeeServiceResponse>(new EmployeeServiceResponse(ResponseCodeEnum.SUCCESS),
				HttpStatus.OK);
	}

	@Override
	public ResponseEntity<EmployeeServiceResponse> getEmployeeById(
			@RequestParam(name = "id", required = true) Long id) {
		EmployeeServiceResponse emp = new EmployeeServiceResponse(ResponseCodeEnum.SUCCESS);
		emp.setEmployee(empser.getEmployeeById(id));
		return new ResponseEntity<EmployeeServiceResponse>(emp, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<EmployeeServiceResponse> deleteEmployeeById(
			@RequestParam(name = "id", required = true) Long id) {
		empser.deleteEmployeeById(id);
		return new ResponseEntity<EmployeeServiceResponse>(new EmployeeServiceResponse(ResponseCodeEnum.SUCCESS),
				HttpStatus.OK);

	}

	@Override
	public ResponseEntity<EmployeeListResponse> getAllEmployees() {
		List<EmployeeDTO> empList = empser.getAllEmployees();
		EmployeeListResponse emp = new EmployeeListResponse(ResponseCodeEnum.SUCCESS, empList);
		return new ResponseEntity<EmployeeListResponse>(emp, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> getPaginatedEmployees(@RequestParam(required = false) String name,
			@RequestParam(value = "page", defaultValue = "0", required = false) int pageNo,
			@RequestParam(value = "size", defaultValue = "10", required = false) int pageSize) {

		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<EmployeeDTO> empPage = empser.searchEmpployee(name, paging);
		EmployeeListResponse emp = new EmployeeListResponse(ResponseCodeEnum.SUCCESS, empPage);
		return new ResponseEntity<Object>(emp, HttpStatus.OK);
	}

}
