package com.example.demo.service;

import com.example.demo.models.Personal;
import com.example.demo.repos.PersonalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonalService{
    private final PersonalRepository personalRepository;

    public PersonalService(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    public List<Personal> findAll(){
        return personalRepository.findAll();
    }

    public List<Personal> save(Personal personal){
        personalRepository.save(personal);
        return personalRepository.findAll();
    }

    public List<Personal> replaceById(int id, Personal personal){
        personalRepository.deleteById(id);
        personalRepository.save(personal);
        return personalRepository.findAll();
    }

    public Personal findById(int id){
        return personalRepository.findById(id).orElse(null);
    }

    public void deleteById(int id){
        personalRepository.deleteById(id);
    }
}
