package com.example.demo.repos;

import com.example.demo.models.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface QualificationRepository extends JpaRepository<Qualification, Integer> {
}
