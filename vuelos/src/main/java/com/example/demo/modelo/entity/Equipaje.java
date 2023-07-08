package com.example.demo.modelo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipaje")
public class Equipaje {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipajeId;
    
    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;
    
    private int peso;
    private String descripcion;
    
	public Equipaje() {
		super();
	}

	public Equipaje(Long equipajeId, Reserva reserva, int peso, String descripcion) {
		super();
		this.equipajeId = equipajeId;
		this.reserva = reserva;
		this.peso = peso;
		this.descripcion = descripcion;
	}

	public Long getEquipajeId() {
		return equipajeId;
	}

	public void setEquipajeId(Long equipajeId) {
		this.equipajeId = equipajeId;
	}


	public Reserva getReserva() {
		return reserva;
	}


	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
    

    // Constructor, getters y setters
}
