package com.crittercorp.myapplication;


public class CustomerModel {
    private boolean T_TUSUARIO;
    private String T_DNI;
    private String T_PROV;
    private String T_CIUDAD;
    private String T_NOMBREYAPE;
    private int T_TELEFONO;
    private String T_EMAIL;
    private String T_DOMICILIO;
    private String T_WEB;

    public CustomerModel(boolean tipoUsuario, String dni, String provincia, String ciudad, String nombreYapellido, int telefono, String email, String domicilio, String web) {
        this.T_TUSUARIO = tipoUsuario;
        this.T_DNI = dni;
        this.T_PROV = provincia;
        this.T_CIUDAD = ciudad;
        this.T_NOMBREYAPE = nombreYapellido;
        this.T_TELEFONO = telefono;
        this.T_EMAIL = email;
        this.T_DOMICILIO = domicilio;
        this.T_WEB = web;
    }

    public boolean gettpoUsuario() {
        return tipoUsuario;
    }

    public String getDni() {
        return dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombreYapellido() {
        return nombreYapellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getWeb() {
        return web;
    }
}
