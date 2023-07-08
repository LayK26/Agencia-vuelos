package com.example.demo.modelo.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Pasajero;
import com.example.demo.modelo.repository.PasajeroRepository;
import com.example.demo.modelo.services.PasajeroService;

@Service
public class PasajeroServiceImpl implements PasajeroService {
    
	@Autowired
	private PasajeroRepository pasajeroRepository;


	public List<Pasajero> listarPasajerosOrdenadosPorId() {
	    return pasajeroRepository.findAll(Sort.by(Sort.Direction.DESC, "pasajeroId"));
	}

    public Pasajero obtenerPasajeroPorId(Long pasajeroId) {
        return pasajeroRepository.findById(pasajeroId).orElseGet(null);
               
    }

    public Pasajero guardarPasajero(Pasajero pasajero) {
        return pasajeroRepository.save(pasajero);
    }


    public void eliminarPasajero(Long pasajeroId) {
        pasajeroRepository.deleteById(pasajeroId);
    }
}
