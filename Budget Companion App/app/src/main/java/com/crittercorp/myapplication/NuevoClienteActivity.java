package com.crittercorp.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class NuevoClienteActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextEmail;
    private EditText editTextTelefono;
    private EditText editTextPais;
    private EditText editTextProvincia;
    private EditText editTextCiudad;
    private EditText editTextCalle;
    private EditText editTextNumero;
    private EditText editTextCP;
    private EditText editTextWeb;

    private Button btnGuardarCliente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_cliente);

        // Inicializar vistas
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextTelefono = findViewById(R.id.editTextTelefono);
        editTextPais = findViewById(R.id.editTextPais);
        editTextProvincia = findViewById(R.id.editTextProvincia);
        editTextCiudad = findViewById(R.id.editTextCiudad);
        editTextCalle = findViewById(R.id.editTextCalle);
        editTextNumero = findViewById(R.id.editTextNumero);
        editTextCP = findViewById(R.id.editTextCP);
        editTextWeb = findViewById(R.id.editTextWeb);

        btnGuardarCliente = findViewById(R.id.btnGuardarCliente);

        btnGuardarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarCliente();
            }
        });
    }

    private void guardarCliente() {
        // Obtener los datos ingresados por el usuario
        String nombre = editTextNombre.getText().toString();
        String apellido = editTextApellido.getText().toString();
        String email = editTextEmail.getText().toString();
        String telefono = editTextTelefono.getText().toString();
        String pais = editTextPais.getText().toString();
        String provincia = editTextProvincia.getText().toString();
        String ciudad = editTextCiudad.getText().toString();
        String calle = editTextCalle.getText().toString();
        String numero = editTextNumero.getText().toString();
        String cp = editTextCP.getText().toString();
        String web = editTextWeb.getText().toString();

        // Validar que los campos obligatorios no estén vacíos
        if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Los campos Nombre, Apellido e Email son obligatorios", Toast.LENGTH_SHORT).show();
            return;
        }

    }
}
