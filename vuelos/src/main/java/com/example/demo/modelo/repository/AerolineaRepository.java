package com.example.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.entity.Aerolineas;

public interface AerolineaRepository extends JpaRepository<Aerolineas, Long> {

}
