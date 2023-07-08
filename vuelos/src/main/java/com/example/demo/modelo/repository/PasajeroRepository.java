package com.example.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.entity.Pasajero;

public interface PasajeroRepository extends JpaRepository<Pasajero, Long> {

}
