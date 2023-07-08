package com.example.demo.modelo.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Reserva;
import com.example.demo.modelo.repository.ReservaRepository;
import com.example.demo.modelo.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {
    
	@Autowired
	private ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> listarReservasOrdenadasPorId() {
        return reservaRepository.findAll(Sort.by(Sort.Direction.ASC, "reservaId"));
    }

  
    public Reserva obtenerReservaPorId(Long reservaId) {
        return reservaRepository.findById(reservaId).orElse(null);
    }

    
    public Reserva guardarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Object> findAllReservaDTOs() {
        return reservaRepository.findAllReservaDTOs();
    }
   
    public void eliminarReserva(Long reservaId) {
        reservaRepository.deleteById(reservaId);
    }
}
