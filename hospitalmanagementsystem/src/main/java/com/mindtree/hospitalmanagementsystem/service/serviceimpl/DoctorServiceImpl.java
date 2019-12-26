package com.mindtree.hospitalmanagementsystem.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hospitalmanagementsystem.dto.DoctorDto;
import com.mindtree.hospitalmanagementsystem.entity.Doctor;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.HospitalManagementServiceException;
import com.mindtree.hospitalmanagementsystem.exception.serviceexception.NoPatientFoundException;
import com.mindtree.hospitalmanagementsystem.repository.DoctorRepository;
import com.mindtree.hospitalmanagementsystem.repository.PatientRepository;
import com.mindtree.hospitalmanagementsystem.service.DoctorService;


@Service
public class DoctorServiceImpl implements DoctorService {

	private ModelMapper modelMapper = new ModelMapper();
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public List<DoctorDto> getAllDoctorsByExperienceAndPatient() throws HospitalManagementServiceException {

		int patientCount = 0;
		List<Doctor> doctors = doctorRepository.findAll();
		List<Doctor> selectedDoctors = new ArrayList<Doctor>();
		List<DoctorDto> doctorDtos = new ArrayList<DoctorDto>();
		for (Doctor doctor : doctors) {
			patientCount=doctor.getPatients().size();
			try {
				if (patientCount == 0)
					throw new NoPatientFoundException("patients not available.");
			} catch (NoPatientFoundException e) {
				throw new HospitalManagementServiceException(e);
			}
			if (patientCount >= 2)
				selectedDoctors.add(doctor);
			patientCount = 0;
		}
		for (Doctor doctor : selectedDoctors) {
			DoctorDto doctorDto = modelMapper.map(doctor, DoctorDto.class);
			doctorDtos.add(doctorDto);
		}

		return doctorDtos;
	}

}
