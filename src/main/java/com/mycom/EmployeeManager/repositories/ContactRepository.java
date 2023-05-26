/**
 * 
 */
package com.mycom.EmployeeManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycom.EmployeeManager.entities.ContactEntity;

/**
 * @author 1028654
 *
 */
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

}
