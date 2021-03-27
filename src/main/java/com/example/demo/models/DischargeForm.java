package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "discharge_form")
public class DischargeForm {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_patient")
    private Integer idPatient;

    @Column(name = "discharge_date")
    private String dischargeDate;

    @Column(name = "final_diagnose")
    private String finalDiagnose;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPatient() {
        return this.idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public String getDischargeDate() {
        return this.dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getFinalDiagnose() {
        return this.finalDiagnose;
    }

    public void setFinalDiagnose(String finalDiagnose) {
        this.finalDiagnose = finalDiagnose;
    }
}
