package com.CrittersCorp.budgetwise;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ClienteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        Button btnAgregarCliente = findViewById(R.id.btnAgregarCliente);
        Button btnListaClientes = findViewById(R.id.btnListaClientes);
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);

        // OnClickListener botón "Agregar Cliente"
        btnAgregarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClienteActivity.this, AgregarClienteActivity.class);
                startActivity(intent);
            }
        });

        // OnClickListener botón "Lista de Clientes"
        btnListaClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClienteActivity.this, ListaClientesActivity.class);
                startActivity(intent);
            }
        });


        // Configurar clic del icono
        iconoSuperiorIzquierdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}