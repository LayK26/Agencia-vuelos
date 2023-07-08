package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.modelo.entity.Equipaje;
import com.example.demo.modelo.entity.Pasajero;
import com.example.demo.modelo.entity.Reserva;
import com.example.demo.modelo.entity.Vuelo;
import com.example.demo.modelo.services.EquipajeService;
import com.example.demo.modelo.services.PasajeroService;
import com.example.demo.modelo.services.ReservaService;
import com.example.demo.modelo.services.VueloService;

import java.util.List;

@Controller
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;
    
    
    @Autowired 
    private VueloService vueloService;
    
    @Autowired
    private PasajeroService pasajeroService;
    
    @Autowired
    private EquipajeService equipajeService;

    @GetMapping("/list")
    public String listPasajeros(Model model) {
    	
        List<Object> reservas = reservaService.findAllReservaDTOs();
        

        model.addAttribute("reserva", reservas);
        
        return "reserva/reservas";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
    	Reserva  res = new Reserva();
    	List<Vuelo> vuelos = vueloService.obtenerlistadevuelospersonalizados();
    	List<Pasajero> pasajeros = pasajeroService.listarPasajerosOrdenadosPorId();
    	List<Equipaje> equipajes = equipajeService.listarEquipajesOrdenadosPorId();
    	
    	model.addAttribute("vuelos", vuelos);
        model.addAttribute("reserva", res);
        model.addAttribute("pasajeros", pasajeros);
        model.addAttribute("equipajes", equipajes);
        
        model.addAttribute("nombreboton", "Crear reserva");
        return "reserva/createEdit";
    }
    
    @PostMapping("/create")
    public String createReserva(@ModelAttribute("reserva") Reserva reserva, @RequestParam("costototal") double costototal) {
    	
    	reserva.setCostototal(costototal);
    	reservaService.guardarReserva(reserva);
        return "redirect:/reserva/list";
    }
    
    @GetMapping("/detalle/{id}")
    public String showDetailForm(@PathVariable("id") Long reservaId , Model model) {
    	
    	Reserva res = reservaService.obtenerReservaPorId(reservaId);
    	
    	System.out.println("RES "+ res);
    	model.addAttribute("reserva", res);
    	
        return "reserva/detalle";
    }

}
