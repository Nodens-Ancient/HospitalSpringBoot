package com.example.demo.service;

import com.example.demo.models.Patient;
import com.example.demo.repos.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatientService{
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patRepo) {
        this.patientRepository = patRepo;
    }

    public List<Patient> findAll(){
        return patientRepository.findAll();
    }

    public List<Patient> save(Patient patient){
        patientRepository.save(patient);
        return patientRepository.findAll();
    }

    public void deleteById(int id){
        patientRepository.deleteById(id);
    }

    public Patient findById(int id){
        return patientRepository.findById(id).orElse(null);
    }

    public List<Patient> replaceById(int id, Patient patient){
        patientRepository.deleteById(id);
        patientRepository.save(patient);
        return patientRepository.findAll();
    }
}
