package com.mycom.EmployeeManager.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycom.EmployeeManager.entities.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

	
	Page<EmployeeEntity> findAll(Pageable pageable);
	Page<EmployeeEntity> findByNameContaining(String name,Pageable pageable);
}
