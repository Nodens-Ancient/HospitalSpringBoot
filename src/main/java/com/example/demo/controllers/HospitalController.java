package com.example.demo.controllers;

import com.example.demo.models.PatientInfo;
import com.example.demo.service.HospitalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HospitalController {
    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/Hospital/patients/{id}")
    public PatientInfo getTreatments(@PathVariable("id") int id){
        return hospitalService.getPatientInfo(id);
    }
}
