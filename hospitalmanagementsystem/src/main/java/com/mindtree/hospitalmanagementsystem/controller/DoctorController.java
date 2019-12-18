package com.mindtree.hospitalmanagementsystem.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hospitalmanagementsystem.dto.DoctorDto;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;
import com.mindtree.hospitalmanagementsystem.responseentity.ResponseEntityData;
import com.mindtree.hospitalmanagementsystem.service.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@GetMapping("/getalldoctorbyexperience")
	public ResponseEntityData getAllDoctorbyExperienceAndPatient() throws HospitalManagementServiceException {

		ResponseEntityData responseEntity = new ResponseEntityData();
		List<DoctorDto> doctorDtos = doctorService.getAllDoctorsByExperienceAndPatient();

		Collections.sort(doctorDtos);
		responseEntity.setError(false);
		responseEntity.setSuccess(true);
		responseEntity.setBody(doctorDtos);
		return responseEntity;

	}
}
