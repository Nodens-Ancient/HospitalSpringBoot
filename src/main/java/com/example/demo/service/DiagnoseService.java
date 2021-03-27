package com.example.demo.service;

import com.example.demo.models.Diagnose;
import com.example.demo.repos.DiagnoseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DiagnoseService {
    private final DiagnoseRepository diagnoseRepository;

    public DiagnoseService(DiagnoseRepository diagRepo) {
        this.diagnoseRepository = diagRepo;
    }

    public List<Diagnose> findAll(){
        return diagnoseRepository.findAll();
    }

    public List<Diagnose> save(Diagnose diagnose){
        diagnoseRepository.save(diagnose);
        return diagnoseRepository.findAll();
    }

    public List<Diagnose> replaceById(int id, Diagnose diagnose){
        diagnoseRepository.deleteById(id);
        diagnoseRepository.save(diagnose);
        return diagnoseRepository.findAll();
    }

    public Diagnose findById(int id){
        return diagnoseRepository.findById(id).orElse(null);
    }

    public void deleteById(int id){
        diagnoseRepository.deleteById(id);
    }

}
