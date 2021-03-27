package com.example.demo.service;

import com.example.demo.models.DischargeForm;
import com.example.demo.repos.DischargeFormRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DischargeFormService {
    private final DischargeFormRepository dischargeFormRepository;

    public DischargeFormService(DischargeFormRepository dischargeFormRepository) {
        this.dischargeFormRepository = dischargeFormRepository;
    }

    public List<DischargeForm> findAll(){
        return dischargeFormRepository.findAll();
    }

    public List<DischargeForm> save(DischargeForm dischargeForm){
        dischargeFormRepository.save(dischargeForm);
        return dischargeFormRepository.findAll();
    }

    public List<DischargeForm> replaceById(int id, DischargeForm dischargeForm){
        dischargeFormRepository.deleteById(id);
        dischargeFormRepository.save(dischargeForm);
        return dischargeFormRepository.findAll();
    }

    public DischargeForm findById(int id){
        return dischargeFormRepository.findById(id).orElse(null);
    }

    public void deleteById(int id){
        dischargeFormRepository.deleteById(id);
    }
}
