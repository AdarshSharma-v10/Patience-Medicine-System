package com.jsp.PatientMedicineAndAppointmentApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
	@RequestMapping("/api/patients")
	public class PatientController {

	    @Autowired
	    private PatientRepository patientRepo;

	    @PostMapping("/register")
	    public Patient register(@RequestBody Patient patient) {
	        return patientRepo.save(patient);
	    }

	    @GetMapping
	    public List<Patient> getAllPatients() {
	        return patientRepo.findAll();
	    }
	}


