package com.mindtree.hospitalmanagementsystem.service;

import org.springframework.stereotype.Service;

import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;

@Service
public interface PatientService {

	/**
	 * @param doctorname
	 * @param patientName
	 * @return 
	 * @throws HospitalManagementServiceException
	 */
	boolean assignDoctorToPatient(String doctorname, String patientName) throws HospitalManagementServiceException;

}
