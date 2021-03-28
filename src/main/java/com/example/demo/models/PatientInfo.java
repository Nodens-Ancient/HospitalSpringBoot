package com.example.demo.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientInfo {
    private Integer id;
    private String name;
    private String phone_Number;
    private List<String> treatment;

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

    public PatientInfo(Integer id, String name, String phone_Number, List<String> treatment) {
        this.id = id;
        this.name = name;
        this.phone_Number = phone_Number;
        this.treatment = treatment;
    }

    public PatientInfo() {
    }
}
