package com.example.demo.modelo.services;

import java.util.List;

import com.example.demo.modelo.entity.Pasajero;

public interface PasajeroService {
	
    List<Pasajero> listarPasajerosOrdenadosPorId();
    Pasajero obtenerPasajeroPorId(Long pasajeroId);
    Pasajero guardarPasajero(Pasajero pasajero);
    void eliminarPasajero(Long pasajeroId);
}
