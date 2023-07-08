package com.example.demo.modelo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aerolineas")
public class Aerolineas {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aerolineaId;
    
    private String nombre;
    private String pais;
    
	public Aerolineas() {
		super();
	}

	public Aerolineas(Long aerolineaId, String nombre, String pais) {
		this.aerolineaId = aerolineaId;
		this.nombre = nombre;
		this.pais = pais;
	}

	public Long getAerolineaId() {
		return aerolineaId;
	}

	public void setAerolineaId(Long aerolineaId) {
		this.aerolineaId = aerolineaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


    // Constructor, getters y setters
    
    
}
