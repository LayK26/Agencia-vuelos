package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.modelo.entity.Pasajero;
import com.example.demo.modelo.services.PasajeroService;

import java.util.List;

@Controller
@RequestMapping("/pasajeros")
public class PasajeroController {

    @Autowired
    private PasajeroService pasajeroService;
    
    
    
    @GetMapping("/list")
    public String listPasajeros(Model model) {
        List<Pasajero> pasajeros = pasajeroService.listarPasajerosOrdenadosPorId();
        model.addAttribute("pasajeros", pasajeros);
        return "pasajero/pasajero";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        Pasajero pasajero = new Pasajero();
        model.addAttribute("pasajero", pasajero);
        model.addAttribute("nombreboton", "Crear pasajero");
        model.addAttribute("nombretitulo", "Crear nuevo Pasajero");
        return "pasajero/createEdit";
    }

    @PostMapping("/create")
    public String createPasajero(@ModelAttribute("pasajero") Pasajero pasajero) {
    	
        if (pasajero.getPasajeroId() == null) {
        	pasajeroService.guardarPasajero(pasajero);
        } else {
  
            Pasajero existingPasajero = pasajeroService.obtenerPasajeroPorId(pasajero.getPasajeroId());
            
            existingPasajero.setPasajeroId(pasajero.getPasajeroId());
            existingPasajero.setNombre(pasajero.getNombre());
            existingPasajero.setApellidos(pasajero.getApellidos());
            existingPasajero.setCorreo(pasajero.getCorreo());
            existingPasajero.setContrasena(pasajero.getContrasena());
            existingPasajero.setNacionalidad(pasajero.getNacionalidad());
            existingPasajero.setFechaNacimiento(pasajero.getFechaNacimiento());
            pasajeroService.guardarPasajero(existingPasajero);
        }

        return "redirect:/pasajeros/list"; 
        
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Pasajero pasajero = pasajeroService.obtenerPasajeroPorId(id);
        model.addAttribute("nombreboton", "Actualizar pasajero");
        model.addAttribute("nombretitulo", "Actualizar Pasajero");
        model.addAttribute("pasajero", pasajero);
        return "pasajero/createEdit";
    }

    @PostMapping("/edit/{id}")
    public String updatePasajero(@PathVariable("id") Long id, @ModelAttribute("pasajero") Pasajero pasajero) {
        pasajero.setPasajeroId(id);
        pasajeroService.guardarPasajero(pasajero);
        return "redirect:/pasajeros/list";
    }

    @GetMapping("/inhabilitar/{id}")
    public String inhabilitarPasajero(@PathVariable("id") Long id) {
        return "redirect:/pasajeros/list";
    }
}
