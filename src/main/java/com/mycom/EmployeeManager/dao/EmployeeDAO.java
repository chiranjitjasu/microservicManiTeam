package com.mycom.EmployeeManager.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.mycom.EmployeeManager.Exception.BusinessException;
import com.mycom.EmployeeManager.Exception.TechnicalException;
import com.mycom.EmployeeManager.dto.employee.EmployeeDTO;
import com.mycom.EmployeeManager.entities.EmployeeEntity;
import com.mycom.EmployeeManager.repositories.ContactRepository;
import com.mycom.EmployeeManager.repositories.EmployeeRepository;

@Component
public class EmployeeDAO {

	@Autowired
	EmployeeRepository emprepo;

	@Autowired
	ContactRepository conRepo;

	@Transactional
	public EmployeeEntity insertemprec(EmployeeEntity empins) throws BusinessException {
		EmployeeEntity entity = isEmployeeExists(empins.getId());
		if (null != entity) {
			throw new BusinessException("Employee already present");
		} else {
			final EmployeeEntity savedemp = emprepo.save(empins);
			/*
			 * if (null != empins.getContacts() && !empins.getContacts().isEmpty()) {
			 * empins.getContacts().forEach(con -> con.setEmp(savedemp));
			 * conRepo.saveAll(empins.getContacts()); }
			 */
			return emprepo.findById(savedemp.getId()).get();
		}

	}

	public EmployeeEntity updateEmpRecord(EmployeeEntity empins) {
		Validate.notNull(empins.getId());
		EmployeeEntity emp = isEmployeeExists(empins.getId());
		return emprepo.save(emp);

	}

	public EmployeeEntity getEmployeeById(Long id) {
		return isEmployeeExists(id);
	}

	public boolean deleteEmployeeById(Long id) {
		EmployeeEntity emp = isEmployeeExists(id);
		emprepo.delete(emp);
		return true;
	}

	public List<EmployeeEntity> getAllEmployees() {

		return emprepo.findAll();
	}

	public Page<EmployeeEntity> searchEmployee(String name, Pageable pageable) {

		return emprepo.findByNameContaining(name, pageable);
	}

	private final EmployeeEntity isEmployeeExists(Long id) {

		Validate.notNull(id);
		Optional<EmployeeEntity> empPresence = emprepo.findById(id);
		if (empPresence.isPresent()) {
			return empPresence.get();
		} else {
			throw new TechnicalException("Employee is not present with provided id");
		}

	}

}
