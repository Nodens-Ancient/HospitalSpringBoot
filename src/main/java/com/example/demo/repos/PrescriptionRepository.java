package com.example.demo.repos;

import com.example.demo.models.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer>{
}
