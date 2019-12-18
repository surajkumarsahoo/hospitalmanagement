package com.mindtree.hospitalmanagementsystem.service.serviceimpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hospitalmanagementsystem.entity.Doctor;
import com.mindtree.hospitalmanagementsystem.entity.Patient;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.DoctorNameNotFoundException;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.PatientNameNotFoundException;
import com.mindtree.hospitalmanagementsystem.repository.DoctorRepository;
import com.mindtree.hospitalmanagementsystem.repository.PatientRepository;
import com.mindtree.hospitalmanagementsystem.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public boolean assignDoctorToPatient(String doctorname, String patientName)
			throws HospitalManagementServiceException {
		boolean isAssigned = false, isDoctorAvailable = false, isPatientAvailable = false;
		List<Doctor> doctors = doctorRepository.findAll();
		List<Patient> patients = patientRepository.findAll();
		try {

			for (Doctor doctor : doctors) {
				if (doctor.getDoctorName().equals(doctorname)) {
					isDoctorAvailable = true;
					for (Patient patient : patients) {
						if (patient.getPatientName().equalsIgnoreCase(patientName)) {
							isPatientAvailable = true;

							patient.setDoctor(doctor);
							patientRepository.save(patient);
							isAssigned = true;
						}

					}
				}

			}

			if (isDoctorAvailable == false)
				throw new DoctorNameNotFoundException("Doctorname not available");
			if (isPatientAvailable == false)
				throw new PatientNameNotFoundException("patient name not available.");

		} catch (DoctorNameNotFoundException | PatientNameNotFoundException e) {
			System.out.println("error");
			throw new HospitalManagementServiceException(e);

		}

		return isAssigned;
	}

}
