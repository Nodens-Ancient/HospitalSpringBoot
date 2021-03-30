package com.example.demo.controllers;

import com.example.demo.models.Diagnose;
import com.example.demo.models.DischargeForm;
import com.example.demo.models.Patient;
import com.example.demo.models.PatientInfo;
import com.example.demo.service.HospitalService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/Hospital/patients/{id}/dischargeform")
    public List<DischargeForm> getPatientDischargeForm(@PathVariable("id") int id){
        return hospitalService.getPatientDischargeForm(id);
    }

    @PostMapping("/Hospital/patients/{id}/dischargeform")
    public void dischargePatient(@PathVariable("id") int id, @RequestBody String finalDiagnose, @RequestBody String dischargeDate){
        hospitalService.dischargePatient(id, dischargeDate, finalDiagnose);
    }

    @GetMapping("/Hospital/patients/{id}/diagnoses")
    public List<Diagnose> getPatientDiagnoses(@PathVariable("id") int id){
        return hospitalService.getPatientDiagnoses(id);
    }

    @GetMapping("/Hospital/patients/{id}/prescriptions")
    public List<String> getPatientPrescriptions(@PathVariable("id") int id){
        return hospitalService.getPatientTreatments(id);
    }
}
