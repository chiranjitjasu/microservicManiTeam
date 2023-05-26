package com.mycom.EmployeeManager.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import com.mycom.EmployeeManager.dto.employee.ContactDto;
import com.mycom.EmployeeManager.dto.employee.EmployeeDTO;
import com.mycom.EmployeeManager.entities.ContactEntity;
import com.mycom.EmployeeManager.entities.EmployeeEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmployeeMapper {
	
	public EmployeeMapper INSTANCE=Mappers.getMapper(EmployeeMapper.class);
	/*
	 * public EmployeeEntity toentity(EmployeeDTO dto) { return new
	 * EmployeeEntity(dto.getName(), dto.getId(), dto.getSalary()); }
	 * 
	 * public EmployeeDTO todto(EmployeeEntity ent) { return new
	 * EmployeeDTO(ent.getName(), ent.getId(), ent.getSalary()); }
	 */
	
	public EmployeeEntity toentity(EmployeeDTO dto);
	public EmployeeDTO todto(EmployeeEntity ent);

	public List<EmployeeEntity> toentityList(List<EmployeeDTO> dto);

	public List<EmployeeDTO> todtoList(List<EmployeeEntity> ent);

	public List<ContactEntity> toContactentity(List<ContactDto> dtoList);

	public List<ContactDto> toContactdto(List<ContactEntity> entList);

	public default Page<EmployeeEntity> toEntityPage(Page<EmployeeDTO> dtoPage) {

		return dtoPage.map(emp -> toentity(emp));
	}

	public default Page<EmployeeDTO> toDtoPage(Page<EmployeeEntity> enityPage) {

		return enityPage.map(emp -> todto(emp));
	}

}
