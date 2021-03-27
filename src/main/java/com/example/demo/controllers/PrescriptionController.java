package com.example.demo.controllers;

import com.example.demo.models.Prescription;
import com.example.demo.service.PrescriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class PrescriptionController {
    private final PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    @GetMapping("/prescriptions")
    public List<Prescription> listAll(){
        return  prescriptionService.findAll();
    }

    @PostMapping("/prescriptions")
    public List<Prescription> save(@RequestBody Prescription prescription){
        return prescriptionService.save(prescription);
    }
    @GetMapping("/prescriptions/{id}")
    public Prescription findById(@PathVariable int id){
        return prescriptionService.findById(id);
    }

    @PostMapping("/prescriptions/{id}")
    public List<Prescription> replaceById(@PathVariable int id, @RequestBody Prescription prescription){
        return prescriptionService.replaceById(id, prescription);
    }

    @DeleteMapping("/prescriptions/{id}")
    public void deleteById(@PathVariable int id){
        prescriptionService.deleteById(id);
    }
}
