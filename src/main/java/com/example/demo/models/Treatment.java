package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "treatment")
public class Treatment {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "qualification_required")
    private Integer qualificationRequiered;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTreatment() {
        return this.treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Integer getQualificationRequired() {
        return this.qualificationRequiered;
    }

    public void setQualificationRequired(Integer qualificationRequiered) {
        this.qualificationRequiered = qualificationRequiered;
    }
}
