package com.crittercorp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VerPresupuestoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_presupuesto);

        // Obtén datos del presupuesto de la intención
        Intent intent = getIntent();
        String cliente = intent.getStringExtra("cliente");
        String fecha = intent.getStringExtra("fecha");
        String total = intent.getStringExtra("total");

        // Configura los TextViews con los datos del presupuesto
        TextView textViewCliente = findViewById(R.id.textViewCliente);
        TextView textViewFecha = findViewById(R.id.textViewFecha);
        TextView textViewTotal = findViewById(R.id.textViewTotal);

        textViewCliente.setText("Cliente: " + cliente);
        textViewFecha.setText("Fecha: " + fecha);
        textViewTotal.setText("Total: " + total);

        // Configura clic del icono para volver atrás
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);
        iconoSuperiorIzquierdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // Configura clic del icono para compartir
        ImageView iconoSuperiorDerecho = findViewById(R.id.iconoSuperiorDerecho);
        iconoSuperiorDerecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para compartir texto
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                // Construye el mensaje de presupuesto
                String mensaje = "Cliente: " + cliente + "\nFecha: " + fecha + "\nTotal: " + total;

                // Establece el texto a compartir
                intent.putExtra(Intent.EXTRA_TEXT, mensaje);

                // Empieza una actividad para compartir el presupuesto
                startActivity(Intent.createChooser(intent, "Compartir presupuesto"));
            }
        });
    }
}
