package com.example.demo.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.modelo.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	@Query(value = "SELECT r.reserva_id, r.fecha_reserva, r.cantidad, p.nombre, v.precio, r.cantidad * v.precio AS total FROM reservas r INNER JOIN vuelos v ON r.vuelo_id = v.vuelo_id INNER JOIN pasajeros p ON r.pasajero_id = p.pasajero_id ORDER BY r.reserva_id DESC", nativeQuery = true)
	List<Object> findAllReservaDTOs();

 
}
