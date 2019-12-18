package com.mindtree.hospitalmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hospitalmanagementsystem.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
