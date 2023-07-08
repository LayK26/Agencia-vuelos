package com.example.demo.modelo.services;

import java.util.List;

import com.example.demo.modelo.entity.Reserva;

public interface ReservaService {
	
    List<Reserva> listarReservasOrdenadasPorId();
    Reserva obtenerReservaPorId(Long reservaId);
    Reserva guardarReserva(Reserva reserva);
    void eliminarReserva(Long reservaId);
    List<Object> findAllReservaDTOs();
}

