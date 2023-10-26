package com.crittercorp.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NuevoPresupuestoActivity extends AppCompatActivity {

    private EditText editTextNombrePresupuesto;
    private EditText editTextAgregarCliente;
    private EditText editTextFecha;
    private EditText editTextAgregarProductoServicio;
    private EditText editTextCantidad;
    private EditText editTextTotalUnitario;
    private Button btnGuardarPresupuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_presupuesto);

        editTextNombrePresupuesto = findViewById(R.id.editTextNombrePresupuesto);
        editTextAgregarCliente = findViewById(R.id.editTextAgregarCliente);
        editTextFecha = findViewById(R.id.editTextFecha);
        editTextAgregarProductoServicio = findViewById(R.id.editTextAgregarProductoServicio);
        editTextCantidad = findViewById(R.id.editTextCantidad);
        editTextTotalUnitario = findViewById(R.id.editTextTotalUnitario);
        btnGuardarPresupuesto = findViewById(R.id.btnGuardarPresupuesto);
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);

        btnGuardarPresupuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombrePresupuesto = editTextNombrePresupuesto.getText().toString();
                String cliente = editTextAgregarCliente.getText().toString();
                String fecha = editTextFecha.getText().toString();
                String productoservicio = editTextAgregarProductoServicio.getText().toString();
                String cantidad = editTextCantidad.getText().toString();
                String totalunitario = editTextTotalUnitario.getText().toString();

                // Guardar datos del presupuesto en SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("MisPresupuestos", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("nombrePresupuesto", nombrePresupuesto);
                editor.putString("cliente", cliente);
                editor.putString("fecha", fecha);
                editor.putString("productoservicio", productoservicio);
                editor.putString("cantidad", cantidad);
                editor.putString("totalunitario", totalunitario);
                editor.apply();

                String mensaje = "Presupuesto guardado con éxito!";
                Toast.makeText(NuevoPresupuestoActivity.this, mensaje, Toast.LENGTH_SHORT).show();

                // Luego de guardar, iniciar la actividad MisPresupuestos
                Intent intent = new Intent(NuevoPresupuestoActivity.this, MisPresupuestos.class);
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

