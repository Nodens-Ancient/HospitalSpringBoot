package com.example.demo.controllers;

import com.example.demo.models.Diagnose;
import com.example.demo.models.DischargeForm;
import com.example.demo.service.DiagnoseService;
import com.example.demo.service.DischargeFormService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DischargeFormController {
    private final DischargeFormService dischargeFormService;
    public DischargeFormController(DischargeFormService dischargeFormService) {
        this.dischargeFormService = dischargeFormService;
    }

    @GetMapping("/dischargeforms")
    public List<DischargeForm> findAll(){
        return  dischargeFormService.findAll();
    }

    @PostMapping("/dischargeforms")
    public List<DischargeForm> save(@RequestBody DischargeForm dischargeForm){ ;
        return dischargeFormService.save(dischargeForm);
    }

    @GetMapping("/dischargeforms/{id}")
    public DischargeForm findById(@PathVariable int id){
        return dischargeFormService.findById(id);
    }

    @PostMapping("/dischargeforms/{id}")
    public List<DischargeForm> replaceById(@PathVariable int id, @RequestBody DischargeForm dischargeForm){
        return dischargeFormService.replaceById(id, dischargeForm);
    }

    @DeleteMapping("/dischargeforms/{id}")
    public void deleteById(@PathVariable int id){
        dischargeFormService.deleteById(id);
    }
}
