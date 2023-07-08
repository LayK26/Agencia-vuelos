package com.example.demo.modelo.services;

import java.util.List;

import com.example.demo.modelo.entity.Aerolineas;

public interface AerolineaService {
	
    List<Aerolineas> listarAerolineasOrdenadasPorId();
    Aerolineas obtenerAerolineaPorId(Long aerolineaId);
    Aerolineas guardarAerolinea(Aerolineas aerolinea);
    void eliminarAerolinea(Long aerolineaId);
    
}
