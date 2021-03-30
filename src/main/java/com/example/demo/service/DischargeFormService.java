package com.example.demo.service;

import com.example.demo.models.DischargeForm;
import com.example.demo.repos.DischargeFormRepository;
import liquibase.pro.packaged.A;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    public List<DischargeForm> getDischargeFormsByPatientId(int id_Patient){
        ArrayList<DischargeForm> dList = new ArrayList<>();
        for (DischargeForm d:
             findAll()) {
            if (d.getIdPatient().equals(id_Patient)){
                dList.add(d);
            }
        }
        return dList;
    }

    public DischargeForm findById(int id){
        return dischargeFormRepository.findById(id).orElse(null);
    }

    public void deleteById(int id){
        dischargeFormRepository.deleteById(id);
    }
}
