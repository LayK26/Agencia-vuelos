package com.example.demo.modelo.services;

import java.util.List;

import com.example.demo.modelo.entity.Aeropuerto;

public interface AeropuertoService {
	
    List<Aeropuerto> listarAeropuertosOrdenadosPorId();
    Aeropuerto obtenerAeropuertoPorId(Long aeropuertoId);
    Aeropuerto guardarAeropuerto(Aeropuerto aeropuerto);
    void eliminarAeropuerto(Long aeropuertoId);
    
}