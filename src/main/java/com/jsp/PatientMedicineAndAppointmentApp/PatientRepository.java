package com.jsp.PatientMedicineAndAppointmentApp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	Patient save1(Patient patient);

	List<Patient> findAll();

	Patient save(Patient patient);
	}


