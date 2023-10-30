package com.crittercorp.myapplication;

import android.view.View;

public class Perfil {
    private String nombreYapellido;
    private String email;
    private String dni;
    private String domicilio;
    private String codigoPostal;
    private String ciudad;
    private String provincia;
    private String telefono;

    // Constructor
    public Perfil(String nombreYapellido, String email, String dni, String domicilio, String codigoPostal, String ciudad, String provincia, String telefono) {
        this.nombreYapellido = nombreYapellido;
        this.email = email;
        this.dni = dni;
        this.domicilio = domicilio;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
    }

//    btn_PerfilEdit.setOnClickListener(new View.OnClickListener()) {
// @Override
//               public void onClick (View v); {
//           try {
//                CustomerModel customerModel = new CustomerModel(-1, T_NOMBREYAPE.getText().toString(), inte)
//  };
//        }
//    }
    // Métodos getters y setters para acceder a los campos



    public void setNombreYapellido(String nombreYapellido) {
        this.nombreYapellido = nombreYapellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
