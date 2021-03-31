package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Diagnoses")
public class Diagnose{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_Patient")
    private int idPatient;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "diagnose")
    private String diagnose;

    public Diagnose() {
    }

    public Diagnose(int idPatient, String symptoms, String diagnose) {
        this.idPatient = idPatient;
        this.symptoms = symptoms;
        this.diagnose = diagnose;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }
}
