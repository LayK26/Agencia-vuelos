package com.example.demo.modelo.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Aeropuerto;
import com.example.demo.modelo.repository.AeropuertoRepository;
import com.example.demo.modelo.services.AeropuertoService;

@Service
public class AeropuertoServiceImpl implements AeropuertoService {
    
	
	@Autowired
	private AeropuertoRepository aeropuertoRepository;


    public List<Aeropuerto> listarAeropuertosOrdenadosPorId() {
        return aeropuertoRepository.findAll(Sort.by(Sort.Direction.ASC, "aeropuertoId"));
    }


    public Aeropuerto obtenerAeropuertoPorId(Long aeropuertoId) {
        return aeropuertoRepository.findById(aeropuertoId).orElse(null);
    }

   
    public Aeropuerto guardarAeropuerto(Aeropuerto aeropuerto) {
        return aeropuertoRepository.save(aeropuerto);
    }

   
    public void eliminarAeropuerto(Long aeropuertoId) {
        aeropuertoRepository.deleteById(aeropuertoId);
    }
}

