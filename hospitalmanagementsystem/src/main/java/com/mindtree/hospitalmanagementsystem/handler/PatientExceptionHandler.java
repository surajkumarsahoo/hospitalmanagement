package com.mindtree.hospitalmanagementsystem.handler;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.hospitalmanagementsystem.controller.PatientController;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.DoctorNameNotFoundException;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.PatientNameNotFoundException;

@RestControllerAdvice(assignableTypes = { PatientController.class })
public class PatientExceptionHandler {

	@ExceptionHandler(PatientNameNotFoundException.class)
	public ResponseEntity<String> handlePatientNameNotFoundException(PatientNameNotFoundException e) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());

	}

	@ExceptionHandler(DoctorNameNotFoundException.class)
	public ResponseEntity<String> handleDoctorNameNotFoundException(DoctorNameNotFoundException ex) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());

	}

}
