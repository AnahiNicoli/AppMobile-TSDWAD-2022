package com.crittercorp.myapplication;

public class Presupuesto {
    private String cliente;
    private String fecha;
    private String precio;

    public Presupuesto(String cliente, String fecha, String precio) {
        if (cliente == null || fecha == null || precio == null) {
            throw new IllegalArgumentException("Los valores no pueden ser nulos.");
        }
        if (cliente.isEmpty() || fecha.isEmpty() || precio.isEmpty()) {
            throw new IllegalArgumentException("Los valores no pueden estar vacíos.");
        }

        this.cliente = cliente;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Fecha: " + fecha + ", Precio: " + precio;
    }
}
