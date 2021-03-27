package com.example.demo.controllers;

import com.example.demo.models.Qualification;
import com.example.demo.service.QualificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class QualificationController {
    private final QualificationService qualificationService;

    public QualificationController(QualificationService qualificationService) {
        this.qualificationService = qualificationService;
    }

    @GetMapping("/qualifications")
    public List<Qualification> findAll(){
        return  qualificationService.findAll();
    }

    @PostMapping("/qualifications")
    public List<Qualification> save(@RequestBody Qualification qualification){ ;
        return qualificationService.save(qualification);
    }

    @GetMapping("/qualifications/{id}")
    public Qualification findById(@PathVariable int id){
        return qualificationService.findById(id);
    }

    @PostMapping("/qualifications/{id}")
    public List<Qualification> replaceById(@PathVariable int id, @RequestBody Qualification qualification){
        return qualificationService.replaceById(id, qualification);
    }

    @DeleteMapping("/qualifications/{id}")
    public void deleteById(@PathVariable int id){
        qualificationService.deleteById(id);
    }
}
