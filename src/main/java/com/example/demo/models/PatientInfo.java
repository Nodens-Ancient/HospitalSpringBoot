package com.example.demo.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientInfo {
    private Integer id;
    private Integer idPatient;
    private String name;
    private String phone_Number;
    private List<String> treatment;

    public PatientInfo(Integer id, Integer idPatient, String name, String phone_Number, List<String> treatment) {
        this.id = id;
        this.idPatient = idPatient;
        this.name = name;
        this.phone_Number = phone_Number;
        this.treatment = treatment;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public List<String> getTreatment() {
        return treatment;
    }

    public void setTreatment(List<String> treatment) {
        this.treatment = treatment;
    }

    public PatientInfo() {
    }
}
