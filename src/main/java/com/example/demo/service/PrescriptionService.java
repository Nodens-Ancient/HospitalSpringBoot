package com.example.demo.service;

import com.example.demo.models.Prescription;
import com.example.demo.repos.PrescriptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PrescriptionService {
    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    public List<Prescription> findAll(){
        return prescriptionRepository.findAll();
    }

    public List<Prescription> save(Prescription prescription){
        prescriptionRepository.save(prescription);
        return prescriptionRepository.findAll();
    }

    public void deleteById(int id){
        prescriptionRepository.deleteById(id);
    }

    public Prescription findById(int id){
        return prescriptionRepository.findById(id).orElse(null);
    }

    public List<Prescription> replaceById(int id, Prescription prescription){
        prescriptionRepository.deleteById(id);
        prescriptionRepository.save(prescription);
        return prescriptionRepository.findAll();
    }
}
