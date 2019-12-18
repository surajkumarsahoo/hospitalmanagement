package com.mindtree.hospitalmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.hospitalmanagementsystem.dto.DoctorDto;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;

@Service
public interface DoctorService {

	/**
	 * @return 
	 * @throws HospitalManagementServiceException
	 */
	List<DoctorDto> getAllDoctorsByExperienceAndPatient() throws HospitalManagementServiceException;

}
