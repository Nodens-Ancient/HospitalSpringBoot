package com.example.demo.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_Medical_History")
    @NonNull
    private int idMedicalHistory;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_Number")
    private String phoneNumber;

    public Patient(Integer id, int idMedicalHistory, String name, String phoneNumber) {
        this.id = id;
        this.idMedicalHistory = idMedicalHistory;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Patient() {

    }

    public int getIdMedicalHistory() {
        return idMedicalHistory;
    }

    public void setIdMedicalHistory(int idMedicalHistory) {
        this.idMedicalHistory = idMedicalHistory;
    }

    public Patient(int idMedicalHistory) {
        this.idMedicalHistory = idMedicalHistory;
    }
}
