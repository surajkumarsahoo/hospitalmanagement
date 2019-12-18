package com.mindtree.hospitalmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;
import com.mindtree.hospitalmanagementsystem.responseentity.ResponseEntityData;
import com.mindtree.hospitalmanagementsystem.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;

	@PostMapping("/assigndoctor/{doctorname}/{patientName}")
	public ResponseEntityData assignDoctor(@PathVariable String doctorname, @PathVariable String patientName)
			throws HospitalManagementServiceException {
		
		ResponseEntityData responseEntity = new ResponseEntityData();
		boolean isAssigned = patientService.assignDoctorToPatient(doctorname, patientName);
		
		responseEntity.setError(false);
		responseEntity.setSuccess(true);
		responseEntity.setMessage("data inserted successfully:" +isAssigned);
		return responseEntity;

	}
	
}
