package com.example.demo.modelo.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aeropuertos")
public class Aeropuerto {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aeropuertoId;
    
    private String nombre;
    private String codigo;
    private String ubicacion;
    
	public Aeropuerto() {
		
	}

	public Aeropuerto(Long aeropuertoId, String nombre, String codigo, String ubicacion) {
		this.aeropuertoId = aeropuertoId;
		this.nombre = nombre;
		this.codigo = codigo;
		this.ubicacion = ubicacion;
	}

	public Long getAeropuertoId() {
		return aeropuertoId;
	}

	public void setAeropuertoId(Long aeropuertoId) {
		this.aeropuertoId = aeropuertoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

    
}
