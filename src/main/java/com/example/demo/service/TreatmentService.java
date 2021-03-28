package com.example.demo.service;

import com.example.demo.models.Treatment;
import com.example.demo.repos.TreatmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TreatmentService {
    private final TreatmentRepository treatmentRepository;

    public TreatmentService(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;
    }

    public List<Treatment> findAll(){
        return treatmentRepository.findAll();
    }

    public List<Treatment> save(Treatment treatment){
        treatmentRepository.save(treatment);
        return treatmentRepository.findAll();
    }

    public void deleteById(int id){
        treatmentRepository.deleteById(id);
    }

    public Treatment findById(int id){
        return treatmentRepository.findById(id).orElse(null);
    }

    public List<Treatment> replaceById(int id, Treatment treatment){
        treatmentRepository.deleteById(id);
        treatmentRepository.save(treatment);
        return treatmentRepository.findAll();
    }
}
