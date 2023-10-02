package com.CrittersCorp.budgetwise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    //private Button btnAgregarProducto;
    //private Button btnAgregarServicio;
    //private Button btnAgregarCliente;
    //private Button btnListaClientes;
    //private Button btnContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnAgregarProducto = findViewById(R.id.btnAgregarProducto);
        //btnAgregarServicio = findViewById(R.id.btnAgregarServicio);
        //btnAgregarCliente = findViewById(R.id.btnAgregarCliente);
        //btnListaClientes = findViewById(R.id.btnListaClientes);
        //btnContacto = findViewById(R.id.btnContacto);
        //navegarAHome = findViewById(R.id.NavegarAHome);


        // OnClickListener botón "Agregar Producto"
        //btnAgregarProducto.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        // Abrir la actividad de agregar producto
        //Intent intent = new Intent(MainActivity.this, AgregarProductoActivity.class);
        //startActivity(intent);
        //}
        //});

        // OnClickListener botón "Agregar Servicio"
        //btnAgregarServicio.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        // Abrir la actividad de agregar servicio
        //Intent intent = new Intent(MainActivity.this, AgregarServicioActivity.class);
        //startActivity(intent);
        // }
        // });

        // OnClickListener botón "Agregar Cliente"
        //btnAgregarCliente.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(MainActivity.this, AgregarClienteActivity.class);
        //startActivity(intent);
        //}
        //});

        // OnClickListener botón "Lista de Clientes"
        //btnListaClientes.setOnClickListener(new View.OnClickListener() {
        // @Override
        // public void onClick(View view) {
        // Intent intent = new Intent(MainActivity.this, ListaClientesActivity.class);
        //  startActivity(intent);
        // }
        //  });

        // OnClickListener botón "Contacto"
        //btnContacto.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(MainActivity.this, ContactActivity.class);
        //startActivity(intent);
        //}
        //});

        // OnClickListener botón "Navegar a Home"
        //navegarAHome.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        //finish(); // Cierra la actividad actual
        //}
        //});
    }



    // Método para navegar a Home
    public void navegarAHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // Método para navegar a Clientes
    public void navegarAClientes(View view) {
        Intent intent = new Intent(this, ClienteActivity.class);
        startActivity(intent);
    }

    // Método para navegar a  Productos
    public void navegarAProductos(View view) {
        Intent intent = new Intent(this, ArticuloServiciosActivity.class);
        startActivity(intent);
    }

    // Método para navegar a 'Ver Más'
    public void navegarAVerMas(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}
