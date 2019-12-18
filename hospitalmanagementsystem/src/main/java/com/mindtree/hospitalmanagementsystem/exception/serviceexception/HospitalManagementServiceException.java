package com.mindtree.hospitalmanagementsystem.exception.serviceexception;

import com.mindtree.hospitalmanagementsystem.exception.HospitalManagementException;

public class HospitalManagementServiceException extends HospitalManagementException {

	public HospitalManagementServiceException() {
		super();
	}

	public HospitalManagementServiceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public HospitalManagementServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public HospitalManagementServiceException(String arg0) {
		super(arg0);
	}

	public HospitalManagementServiceException(Throwable arg0) {
		super(arg0);
	}

}
