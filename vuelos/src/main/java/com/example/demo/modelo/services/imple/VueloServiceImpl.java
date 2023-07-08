package com.example.demo.modelo.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Vuelo;
import com.example.demo.modelo.repository.VueloRepository;
import com.example.demo.modelo.services.VueloService;

@Service
public class VueloServiceImpl implements VueloService {
    
	@Autowired
	private  VueloRepository vueloRepository;

    public VueloServiceImpl(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }


    public List<Vuelo> listarVuelosOrdenadosPorId() {
        return vueloRepository.findAll(Sort.by(Sort.Direction.ASC, "vueloId"));
    }

 
    public Vuelo obtenerVueloPorId(Long vueloId) {
        return vueloRepository.findById(vueloId).orElse(null);               
    }


    public Vuelo guardarVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

   
    public void eliminarVuelo(Long vueloId) {
        vueloRepository.deleteById(vueloId);
    }
    
    public List<Vuelo> obtenerlistadevuelospersonalizados() {
        return vueloRepository.listaPersonalizadadeVuelos();
      }
}
