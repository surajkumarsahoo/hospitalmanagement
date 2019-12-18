package com.mindtree.hospitalmanagementsystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Doctor {

	@Id
	private int doctorId;
	private String doctorName;
	private float yearOfExperience;
	private double salary;
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "doctor")
	private Set<Patient> patients;

	public Doctor() {
	}

	public Doctor(int doctorId, String doctorName, float yearOfExperience, double salary, Set<Patient> patients) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.yearOfExperience = yearOfExperience;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", yearOfExperience=" + yearOfExperience
				+ ", salary=" + salary + ", patients=" + patients + "]";
	}

}
