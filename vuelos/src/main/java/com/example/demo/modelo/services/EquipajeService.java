package com.example.demo.modelo.services;

import java.util.List;

import com.example.demo.modelo.entity.Equipaje;

public interface EquipajeService {
	
    List<Equipaje> listarEquipajesOrdenadosPorId();
    Equipaje obtenerEquipajePorId(Long equipajeId);
    Equipaje guardarEquipaje(Equipaje equipaje);
    void eliminarEquipaje(Long equipajeId);
}
