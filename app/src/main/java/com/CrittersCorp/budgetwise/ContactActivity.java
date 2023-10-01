package com.CrittersCorp.budgetwise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactActivity extends Activity {
    // Declaración de elementos de la interfaz de usuario
    private EditText etNombre;
    private EditText etCorreo;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        // Inicialización de elementos de la interfaz de usuario
        etNombre = findViewById(R.id.etNombre);
        etCorreo = findViewById(R.id.etCorreo);
        btnEnviar = findViewById(R.id.btnEnviar);

        // Asignar un listener al botón de enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarFormulario();
            }
        });
    }

    // Método para procesar el envío del formulario
    private void enviarFormulario() {
        String nombre = etNombre.getText().toString();
        String correo = etCorreo.getText().toString();

        if (nombre.isEmpty() || correo.isEmpty()) {
            // Validación simple: asegurarse de que ambos campos estén completos
            Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show();
        } else {
            // Aquí puedes implementar la lógica para enviar el formulario, como enviar un correo electrónico o realizar una solicitud de red
            // En este ejemplo, simplemente mostramos un mensaje de éxito
            Toast.makeText(this, "Formulario enviado con éxito.", Toast.LENGTH_SHORT).show();
        }

    }

}
