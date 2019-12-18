package com.mindtree.hospitalmanagementsystem.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.hospitalmanagementsystem.controller.DoctorController;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.NoPatientFoundException;

@RestControllerAdvice(assignableTypes = { DoctorController.class })
public class DoctorExceptionHandler {

	@ExceptionHandler(HospitalManagementServiceException.class)
	public ResponseEntity<String> handleNoPatientFoundException(NoPatientFoundException e) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());

	}

}