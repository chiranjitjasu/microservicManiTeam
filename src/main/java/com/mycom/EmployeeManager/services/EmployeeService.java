package com.mycom.EmployeeManager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mycom.EmployeeManager.Exception.BusinessException;
import com.mycom.EmployeeManager.Mapper.EmployeeMapper;
import com.mycom.EmployeeManager.dao.EmployeeDAO;
import com.mycom.EmployeeManager.dto.employee.EmployeeDTO;
import com.mycom.EmployeeManager.entities.EmployeeEntity;
import com.mycom.EmployeeManager.tasks.asyncTestMessaseTask;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO empdao;
	@Autowired
	EmployeeMapper empmap;

	public EmployeeDTO createemployee(EmployeeDTO empdto) throws BusinessException {

		//new AsynchronousServiceMessage().executeAsynchronously();
		return empmap.todto(empdao.insertemprec(empmap.toentity(empdto)));
		
		
	}

	public EmployeeDTO updateEmployee(EmployeeDTO empdto) {

		return empmap.todto(empdao.updateEmpRecord(empmap.toentity(empdto)));
	}

	public EmployeeDTO getEmployeeById(Long id) {
		return empmap.todto(empdao.getEmployeeById(id));

	}

	public boolean deleteEmployeeById(Long id) {
		return empdao.deleteEmployeeById(id);

	}

	public List<EmployeeDTO> getAllEmployees() {

		return empmap.todtoList(empdao.getAllEmployees());
	}
	
	public Page<EmployeeDTO> searchEmpployee(String name,Pageable pageable) {

		return empmap.toDtoPage(empdao.searchEmployee(name, pageable));
	}
	
	

	
}
