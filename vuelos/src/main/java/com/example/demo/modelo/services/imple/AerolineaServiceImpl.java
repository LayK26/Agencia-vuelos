package com.example.demo.modelo.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Aerolineas;
import com.example.demo.modelo.repository.AerolineaRepository;
import com.example.demo.modelo.services.AerolineaService;

@Service
public class AerolineaServiceImpl implements AerolineaService {
    
	@Autowired
	private AerolineaRepository aerolineaRepository;


    public List<Aerolineas> listarAerolineasOrdenadasPorId() {
        return aerolineaRepository.findAll(Sort.by(Sort.Direction.ASC, "aerolineaId"));
    }

   
    public Aerolineas obtenerAerolineaPorId(Long aerolineaId) {
        return aerolineaRepository.findById(aerolineaId).orElseGet(null);
    }

 
    public Aerolineas guardarAerolinea(Aerolineas aerolinea) {
        return aerolineaRepository.save(aerolinea);
    }

   
    public void eliminarAerolinea(Long aerolineaId) {
        aerolineaRepository.deleteById(aerolineaId);
    }
}

