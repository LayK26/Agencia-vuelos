package com.example.demo.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.modelo.entity.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, Long> {

	  @Query("SELECT v FROM Vuelo v JOIN FETCH v.origenAeropuerto JOIN FETCH v.destinoAeropuerto JOIN FETCH v.aerolinea")
	  List<Vuelo> listaPersonalizadadeVuelos();
}

