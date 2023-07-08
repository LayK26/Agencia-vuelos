package com.example.demo.modelo.entity;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservaId;
    
    @ManyToOne
    @JoinColumn(name = "vuelo_id")
    private Vuelo vuelo;
    
    @ManyToOne
    @JoinColumn(name = "pasajero_id")
    private Pasajero pasajero;
    
    private String asiento;
    
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaReserva;
    
    private int cantidad;
    private double costototal;
    
    
	public Reserva() {
	
	}


	public Reserva(Long reservaId, Vuelo vuelo, Pasajero pasajero, String asiento, Date fechaReserva, int cantidad,
			double costototal) {
		this.reservaId = reservaId;
		this.vuelo = vuelo;
		this.pasajero = pasajero;
		this.asiento = asiento;
		this.fechaReserva = fechaReserva;
		this.cantidad = cantidad;
		this.costototal = costototal;
	}


	public Long getReservaId() {
		return reservaId;
	}


	public void setReservaId(Long reservaId) {
		this.reservaId = reservaId;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


	public Pasajero getPasajero() {
		return pasajero;
	}


	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}


	public String getAsiento() {
		return asiento;
	}


	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}


	public Date getFechaReserva() {
		return fechaReserva;
	}


	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getCostototal() {
		return costototal;
	}


	public void setCostototal(double costototal) {
		this.costototal = costototal;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva [reservaId=");
		builder.append(reservaId);
		builder.append(", vuelo=");
		builder.append(vuelo);
		builder.append(", pasajero=");
		builder.append(pasajero);
		builder.append(", asiento=");
		builder.append(asiento);
		builder.append(", fechaReserva=");
		builder.append(fechaReserva);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append(", costototal=");
		builder.append(costototal);
		builder.append("]");
		return builder.toString();
	}
    
	
    
    
    // Constructor, getters y setters
}

