package com.CrittersCorp.budgetwise;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AgregarProductoActivity extends AppCompatActivity {

    private EditText editTextNombreProducto;
    private EditText editTextCantidad;
    private EditText editTextPrecio;
    private TextView textViewDetalle;
    private Button btnGuardarProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        // Inicializar vistas
        editTextNombreProducto = findViewById(R.id.editTextNombreProducto);
        editTextCantidad = findViewById(R.id.editTextCantidad);
        editTextPrecio = findViewById(R.id.editTextPrecio);
        textViewDetalle = findViewById(R.id.textViewDetalle);
        btnGuardarProducto = findViewById(R.id.btnGuardarProducto);
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);


        // OnClickListener botón "Guardar"
        btnGuardarProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener valores de los campos de texto:
                String nombreProducto = editTextNombreProducto.getText().toString();
                String cantidad = editTextCantidad.getText().toString();
                String precio = editTextPrecio.getText().toString();
                String detalle = textViewDetalle.getText().toString();

                // Luego, puedes realizar la acción de edición o guardar los valores en tu base de datos
                // Por ahora, solo mostraremos un mensaje para verificar que el botón funciona
                String mensaje = "Nombre: " + nombreProducto + "\nCantidad: " + cantidad + "\nPrecio: " + precio + "\nDetalle: " + detalle;

                // Muestra el mensaje en un Toast
                Toast.makeText(AgregarProductoActivity.this, mensaje, Toast.LENGTH_SHORT).show();
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
