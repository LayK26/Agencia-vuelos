package com.example.demo.modelo.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Equipaje;
import com.example.demo.modelo.repository.EquipajeRepository;
import com.example.demo.modelo.services.EquipajeService;

@Service
public class EquipajeServiceImpl implements EquipajeService {
    
	@Autowired
	private EquipajeRepository equipajeRepository;


    public List<Equipaje> listarEquipajesOrdenadosPorId() {
        return equipajeRepository.findAll(Sort.by(Sort.Direction.ASC, "equipajeId"));
    }

  
    public Equipaje obtenerEquipajePorId(Long equipajeId) {
        return equipajeRepository.findById(equipajeId).orElse(null);
    }

 
    public Equipaje guardarEquipaje(Equipaje equipaje) {
        return equipajeRepository.save(equipaje);
    }

  
    public void eliminarEquipaje(Long equipajeId) {
        equipajeRepository.deleteById(equipajeId);
    }
}
