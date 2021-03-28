package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "prescriptions")
public class Prescription {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_Patient")
    private Integer idPatient;

    @Column(name = "id_treatment")
    private Integer idTreatment;

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

    public Integer getIdTreatment() {
        return this.idTreatment;
    }

    public void setIdTreatment(Integer idTreatment) {
        this.idTreatment = idTreatment;
    }
}
