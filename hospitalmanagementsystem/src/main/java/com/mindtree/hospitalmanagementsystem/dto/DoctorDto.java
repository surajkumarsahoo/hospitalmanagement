package com.mindtree.hospitalmanagementsystem.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class DoctorDto implements Comparable<DoctorDto> {

	private int doctorId;
	private String doctorName;
	private float yearOfExperience;
	@JsonIgnoreProperties("doctor")
	private Set<PatientDto> patients;

	public DoctorDto() {
	}

	public DoctorDto(int doctorId, String doctorName, float yearOfExperience, Set<PatientDto> patients) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.yearOfExperience = yearOfExperience;
		this.patients = patients;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public float getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(float yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public Set<PatientDto> getPatients() {
		return patients;
	}

	public void setPatients(Set<PatientDto> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "DoctorDto [doctorId=" + doctorId + ", doctorName=" + doctorName + ", yearOfExperience="
				+ yearOfExperience + ", patients=" + patients + "]";
	}

	@Override
	public int compareTo(DoctorDto doctorDto) {
		return (int) (doctorDto.getYearOfExperience()-this.getYearOfExperience());
	}

}
