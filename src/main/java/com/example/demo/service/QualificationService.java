package com.example.demo.service;

import com.example.demo.models.Qualification;
import com.example.demo.repos.QualificationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QualificationService {
    private final QualificationRepository qualificationRepository;

    public QualificationService(QualificationRepository qualificationRepository) {
        this.qualificationRepository = qualificationRepository;
    }

    public List<Qualification> findAll(){
        return qualificationRepository.findAll();
    }

    public List<Qualification> save(Qualification qualification){
        qualificationRepository.save(qualification);
        return qualificationRepository.findAll();
    }

    public void deleteById(int id){
        qualificationRepository.deleteById(id);
    }

    public Qualification findById(int id){
        return qualificationRepository.findById(id).orElse(null);
    }

    public List<Qualification> replaceById(int id, Qualification qualification){
        qualificationRepository.deleteById(id);
        qualificationRepository.save(qualification);
        return qualificationRepository.findAll();
    }
}
