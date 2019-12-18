package com.mindtree.hospitalmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class PatientDto {

	private int patientId;
	private String patientName;
	private float billAmount;
	@JsonIgnoreProperties("patients")
	private DoctorDto doctor;

	public PatientDto() {
	}

	public PatientDto(int patientId, String patientName, float billAmount, DoctorDto doctor) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.billAmount = billAmount;
		this.doctor = doctor;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

	public DoctorDto getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorDto doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "PatientDto [patientId=" + patientId + ", patientName=" + patientName + ", billAmount=" + billAmount
				+ ", doctor=" + doctor + "]";
	}

}
