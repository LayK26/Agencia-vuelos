package com.example.demo.modelo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelos")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vueloId;
    
    @ManyToOne
    @JoinColumn(name = "origen_aeropuerto_id")
    private Aeropuerto origenAeropuerto;
    
    @ManyToOne
    @JoinColumn(name = "destino_aeropuerto_id")
    private Aeropuerto destinoAeropuerto;
    
    @ManyToOne
    @JoinColumn(name = "aerolinea_id")
    private Aerolineas aerolinea;
    
    private Date horaSalida;
    private Date horaLlegada;
    private double precio;

    
	public Vuelo() {
	
	}
	
	
	public Vuelo(Long vueloId, Aeropuerto origenAeropuerto, Aeropuerto destinoAeropuerto, Aerolineas aerolinea,
			Date horaSalida, Date horaLlegada, double precio) {
		super();
		this.vueloId = vueloId;
		this.origenAeropuerto = origenAeropuerto;
		this.destinoAeropuerto = destinoAeropuerto;
		this.aerolinea = aerolinea;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.precio = precio;
	}


	public Long getVueloId() {
		return vueloId;
	}

	public void setVueloId(Long vueloId) {
		this.vueloId = vueloId;
	}

	public Aeropuerto getOrigenAeropuerto() {
		return origenAeropuerto;
	}

	public void setOrigenAeropuerto(Aeropuerto origenAeropuerto) {
		this.origenAeropuerto = origenAeropuerto;
	}

	public Aeropuerto getDestinoAeropuerto() {
		return destinoAeropuerto;
	}

	public void setDestinoAeropuerto(Aeropuerto destinoAeropuerto) {
		this.destinoAeropuerto = destinoAeropuerto;
	}

	public Aerolineas getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolineas aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}



    
}
