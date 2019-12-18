package com.mindtree.hospitalmanagementsystem.exception.serviceexception;

public class PatientNameNotFoundException extends HospitalManagementServiceException {

	public PatientNameNotFoundException() {
		super();
	}

	public PatientNameNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public PatientNameNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public PatientNameNotFoundException(String arg0) {
		super(arg0);
	}

	public PatientNameNotFoundException(Throwable arg0) {
		super(arg0);
	}

}
