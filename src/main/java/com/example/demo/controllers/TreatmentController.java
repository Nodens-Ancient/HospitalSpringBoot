package com.example.demo.controllers;

import com.example.demo.models.Treatment;
import com.example.demo.service.TreatmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TreatmentController {
    private final TreatmentService treatmentService;

    public TreatmentController(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }

    @GetMapping("/treatment")
    public List<Treatment> findAll(){
        return  treatmentService.findAll();
    }

    @PostMapping("/treatment")
    public List<Treatment> save(@RequestBody Treatment treatment){ ;
        return treatmentService.save(treatment);
    }

    @GetMapping("/treatment/{id}")
    public Treatment findById(@PathVariable int id){
        return treatmentService.findById(id);
    }

    @PostMapping("/treatment/{id}")
    public List<Treatment> replaceById(@PathVariable int id, @RequestBody Treatment treatment){
        return treatmentService.replaceById(id, treatment);
    }

    @DeleteMapping("/treatment/{id}")
    public void deleteById(@PathVariable int id){
        treatmentService.deleteById(id);
    }
}
