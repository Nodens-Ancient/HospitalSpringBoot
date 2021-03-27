package com.example.demo.controllers;

import com.example.demo.models.Patient;
import com.example.demo.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<Patient> listAll(){
        return  patientService.findAll();
    }

    @PostMapping("/patients")
    public List<Patient> save(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    @GetMapping("/patients/{id}")
    public Patient findById(@PathVariable int id){
        return patientService.findById(id);
    }

    @PostMapping("/patients/{id}")
    public List<Patient> replaceById(@PathVariable int id, @RequestBody Patient patient){
        return patientService.replaceById(id, patient);
    }

    @DeleteMapping("/patients/{id}")
    public void deleteById(@PathVariable int id){
        patientService.deleteById(id);
    }

}
