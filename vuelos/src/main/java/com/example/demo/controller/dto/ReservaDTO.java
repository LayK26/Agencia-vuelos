package com.example.demo.controller.dto;

import java.util.Date;

public class ReservaDTO {
    private Long reservaId;
    private Date fechaReserva;
    private int cantidad;
    private double precioVuelo;
    private String nombrePasajero;
    private double total;

    
    public ReservaDTO() {
    }

    public ReservaDTO(Long reservaId, Date fechaReserva, int cantidad, double precioVuelo, String nombrePasajero) {
        this.reservaId = reservaId;
        this.fechaReserva = fechaReserva;
        this.cantidad = cantidad;
        this.precioVuelo = precioVuelo;
        this.nombrePasajero = nombrePasajero;
        this.total = cantidad * precioVuelo;
    }

    public Long getReservaId() {
        return reservaId;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioVuelo() {
        return precioVuelo;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }


    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "ReservaDTO [reservaId=" + reservaId + ", fechaReserva=" + fechaReserva + ", cantidad=" + cantidad
                + ", precioVuelo=" + precioVuelo + ", nombrePasajero=" + nombrePasajero + ", total=" + total + "]";
    }

    
}