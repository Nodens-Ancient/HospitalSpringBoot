package com.example.demo.repos;

import com.example.demo.models.Diagnose;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnoseRepository extends JpaRepository<Diagnose, Integer>{
}
