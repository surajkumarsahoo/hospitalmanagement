package com.mindtree.hospitalmanagementsystem.exception.serviceexception;

public class DoctorNameNotFoundException extends HospitalManagementServiceException {

	public DoctorNameNotFoundException() {
		super();
	}

	public DoctorNameNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public DoctorNameNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DoctorNameNotFoundException(String arg0) {
		super(arg0);
	}

	public DoctorNameNotFoundException(Throwable arg0) {
		super(arg0);
	}

}
