package com.crittercorp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AgregarClienteActivity extends AppCompatActivity {

    private EditText nombreClienteEditText;
    private final List<Cliente> listaClientes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_cliente);

        nombreClienteEditText = findViewById(R.id.editTextNombre);
        Button agregarClienteButton = findViewById(R.id.btnGuardarCliente);
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);

        agregarClienteButton.setOnClickListener(view -> {
            String nombreCliente = nombreClienteEditText.getText().toString();

            if (!nombreCliente.isEmpty()) {
                Cliente cliente = new Cliente(nombreCliente);
                listaClientes.add(cliente);
                nombreClienteEditText.getText().clear();

                Intent intent = new Intent(AgregarClienteActivity.this, ListaClientesActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(AgregarClienteActivity.this, "Por favor, ingresa un nombre de cliente", Toast.LENGTH_SHORT).show();
            }
        });

        // Icono para volver a la pantalla anterior
        iconoSuperiorIzquierdo.setOnClickListener(view -> onBackPressed());
    }
}

