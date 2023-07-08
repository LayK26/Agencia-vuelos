package com.example.demo.modelo.services;

import java.util.List;

import com.example.demo.modelo.entity.Vuelo;

public interface VueloService {
	
    List<Vuelo> listarVuelosOrdenadosPorId();
    Vuelo obtenerVueloPorId(Long vueloId);
    Vuelo guardarVuelo(Vuelo vuelo);
    void eliminarVuelo(Long vueloId);
    List<Vuelo> obtenerlistadevuelospersonalizados();
}
