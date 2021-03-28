package com.example.demo.controllers;

import com.example.demo.models.Personal;
import com.example.demo.service.PersonalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonalController {
    private final PersonalService personalService;

    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @GetMapping("/personal")
    public List<Personal> listAll(){
        return  personalService.findAll();
    }

    @PostMapping("/personal")
    public List<Personal> save(@RequestBody Personal personal){
        return personalService.save(personal);
    }

    @GetMapping("/personal/{id}")
    public Personal findById(@PathVariable int id){
        return personalService.findById(id);
    }

    @PostMapping("/personal/{id}")
    public List<Personal> replaceById(@PathVariable int id, @RequestBody Personal personal){
        return personalService.replaceById(id, personal);
    }

    @DeleteMapping("/personal/{id}")
    public void deleteById(@PathVariable int id){
        personalService.deleteById(id);
    }
}
