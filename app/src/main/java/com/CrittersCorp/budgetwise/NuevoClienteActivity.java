package com.CrittersCorp.budgetwise;


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

    // Lista para almacenar los datos de los clientes
    //private List<Cliente> listaClientes = new ArrayList<>();

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
            Toast.makeText(this, "Los campos Nombre, Apellido y Email son obligatorios", Toast.LENGTH_SHORT).show();
            return;
        }

        // Crear un objeto Cliente con los datos ingresados
        //Cliente cliente = new Cliente(nombre, apellido, email, telefono, pais, provincia, ciudad, calle, numero, cp, web);

        // Agregar el cliente a la lista
        //listaClientes.add(cliente);

        // Limpiar el EditText después de agregar el cliente
        //nombreClienteEditText.getText().clear();

        // Mostrar un mensaje de éxito o realizar otras acciones necesarias
        //Toast.makeText(AgregarClienteActivity.this, "Cliente agregado con éxito", Toast.LENGTH_SHORT).show();
        //} else {
        // Mostrar un mensaje de error si el nombre está vacío
        //Toast.makeText(AgregarClienteActivity.this, "El nombre del cliente no puede estar vacío", Toast.LENGTH_SHORT).show();
    }
}
