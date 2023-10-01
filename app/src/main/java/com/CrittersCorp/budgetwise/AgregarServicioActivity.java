package com.CrittersCorp.budgetwise;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AgregarServicioActivity extends AppCompatActivity {

    private EditText editTextNombreServicio;
    private Button btnGuardarServicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_servicio);

        // Inicializar vistas
        editTextNombreServicio = findViewById(R.id.editTextNombreServicio);
        btnGuardarServicio = findViewById(R.id.btnGuardarServicio);
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);

        // OnClickListener botón "Guardar"
        btnGuardarServicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí puedes agregar lógica para guardar el servicio
                String nombreServicio = editTextNombreServicio.getText().toString();

                // Por ahora, solo mostraremos un mensaje para verificar que el botón funciona
                String mensaje = "Nombre del Servicio: " + nombreServicio;

                // Muestra el mensaje en un Toast
                Toast.makeText(AgregarServicioActivity.this, mensaje, Toast.LENGTH_SHORT).show();
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
