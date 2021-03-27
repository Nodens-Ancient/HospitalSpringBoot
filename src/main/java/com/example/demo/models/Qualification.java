package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "qualifications")
public class Qualification {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "work")
    private String work;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWork() {
        return this.work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
