package com.crittercorp.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ContactActivity extends Activity {
    private EditText etNombre;
    private EditText etCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        etNombre = findViewById(R.id.etNombre);
        etCorreo = findViewById(R.id.etCorreo);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);

        btnEnviar.setOnClickListener(view -> enviarFormulario());

        // Configurar clic del icono para volver atrás
        iconoSuperiorIzquierdo.setOnClickListener(view -> onBackPressed());
    }


    // Método envío formulario
    private void enviarFormulario() {
        String nombre = etNombre.getText().toString();
        String correo = etCorreo.getText().toString();

        if (nombre.isEmpty() || correo.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show();
        } else {
            // Mensaje de éxito
            Toast.makeText(this, "Formulario enviado con éxito.", Toast.LENGTH_SHORT).show();
        }

    }

}