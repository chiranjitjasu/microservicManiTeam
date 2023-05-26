package com.mycom.EmployeeManager.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycom.EmployeeManager.dto.employee.EmployeeDTO;
import com.mycom.EmployeeManager.dto.response.BaseResponse;
import com.mycom.EmployeeManager.dto.response.EmployeeListResponse;
import com.mycom.EmployeeManager.dto.response.EmployeeServiceResponse;
import com.mycom.EmployeeManager.Exception.BusinessException;
import com.mycom.EmployeeManager.entities.EmployeeEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/employeemanager/api/")
public interface EmployeeAPI {

	@Operation(operationId = "EmployeeAPI", summary = "create employee", tags = {
			"card payment" }, responses = {

					@ApiResponse(responseCode = "200", description = "Success", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "400", description = "Bad Request", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "401", description = "Unauthorized", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "403", description = "Forbidden", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "404", description = "Not Found", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "409", description = "Conflict", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }) })
	@PostMapping(value = "/createEmployee", produces = { "application/json;charset=utf-8",
			"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	public default ResponseEntity<EmployeeServiceResponse> createEmployee(@RequestBody EmployeeDTO employee)
			throws BusinessException {

		return null;
	}

	@Operation(operationId = "Update employee", summary = "Api wupdate an employee", tags = {
			"update employee" }, responses = {

					@ApiResponse(responseCode = "200", description = "Success", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "400", description = "Bad Request", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "401", description = "Unauthorized", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "403", description = "Forbidden", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "404", description = "Not Found", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "409", description = "Conflict", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }) })
	@PutMapping(value = "/updateEmployee", produces = { "application/json;charset=utf-8",
			"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	public default ResponseEntity<EmployeeServiceResponse> updateEmployeeById(@RequestBody EmployeeDTO empBody) {

		return null;
	}

	@Operation(operationId = "get  employee by id", summary = "Api to get an employee", tags = {
			"get employee by" }, responses = {

					@ApiResponse(responseCode = "200", description = "Success", content = {
							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "400", description = "Bad Request", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "401", description = "Unauthorized", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "403", description = "Forbidden", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "404", description = "Not Found", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "409", description = "Conflict", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

					@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

							@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }) })
	@GetMapping(value = "/getEmployeeById", produces = { "application/json;charset=utf-8",
			"application/xml" }, consumes = { "application/json;charset=utf-8", "application/xml" })
	public default ResponseEntity<EmployeeServiceResponse> getEmployeeById(@RequestParam Long id) {
		return null;
	}

	@Operation(operationId = "delete employee", summary = "delete employee", tags = { "delete employee" }, responses = {

			@ApiResponse(responseCode = "200", description = "Success", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "400", description = "Bad Request", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "403", description = "Forbidden", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "404", description = "Not Found", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "409", description = "Conflict", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }) })

	@DeleteMapping("/deleteEmployeeById")
	public default ResponseEntity<EmployeeServiceResponse>  deleteEmployeeById(@RequestParam Long id) {

		return null;

	}

	@Operation(operationId = "get employee", summary = "Api to get  employee", tags = { "get employee" }, responses = {

			@ApiResponse(responseCode = "200", description = "Success", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "400", description = "Bad Request", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "403", description = "Forbidden", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "404", description = "Not Found", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "409", description = "Conflict", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }) })
	@GetMapping("/getAllEmployees")
	public default ResponseEntity<EmployeeListResponse> getAllEmployees() {
		return null;
	}
	
	
	@Operation(operationId = "get employee", summary = "Api to get  employee", tags = { "get employee" }, responses = {

			@ApiResponse(responseCode = "200", description = "Success", content = {
					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "400", description = "Bad Request", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "401", description = "Unauthorized", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "403", description = "Forbidden", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "404", description = "Not Found", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "405", description = "Method Not allowed", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "409", description = "Conflict", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }),

			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = {

					@Content(mediaType = "application/json;charset=utf-8", schema = @Schema(implementation = BaseResponse.class)) }) })
	@GetMapping("/searchEmployee")
	public default ResponseEntity<Object> getPaginatedEmployees(@RequestParam(required = false) String name,
			@RequestParam(value = "page", defaultValue = "0", required = false) int pageNo,
			@RequestParam(value = "size", defaultValue = "10", required = false) int pageSize) {
		return null;
	}

}
