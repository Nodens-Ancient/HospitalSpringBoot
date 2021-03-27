package com.example.demo.controllers;

import com.example.demo.models.Diagnose;
import com.example.demo.service.DiagnoseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiagnoseController {

    private final DiagnoseService diagnoseService;
    public DiagnoseController(DiagnoseService diagnoseService) {
        this.diagnoseService = diagnoseService;
    }

    @GetMapping("/diagnoses")
    public List<Diagnose> findAll(){
        return  diagnoseService.findAll();
    }

    @PostMapping("/diagnoses")
    public List<Diagnose> save(@RequestBody Diagnose diagnose){ ;
        return diagnoseService.save(diagnose);
    }

    @GetMapping("/diagnoses/{id}")
    public Diagnose findById(@PathVariable int id){
        return diagnoseService.findById(id);
    }

    @PostMapping("/diagnoses/{id}")
    public List<Diagnose> replaceById(@PathVariable int id, @RequestBody Diagnose diagnose){
        return diagnoseService.replaceById(id, diagnose);
    }

    @DeleteMapping("/diagnoses/{id}")
    public void deleteById(@PathVariable int id){
        diagnoseService.deleteById(id);
    }
}
