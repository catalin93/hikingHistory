package com.example.demo.repository;

import com.example.demo.entities.Hiking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HikingRepository extends JpaRepository<Hiking, Long> {
}
