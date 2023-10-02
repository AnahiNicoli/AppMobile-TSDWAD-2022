package com.CrittersCorp.budgetwise;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class ArticuloServiciosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articulo_servicios_activity);

        // Inicializar vistas
        SearchView searchView = findViewById(R.id.searchView);
        Button btnAgregarProducto = findViewById(R.id.btnAgregarProducto);
        Button btnAgregarServicio = findViewById(R.id.btnAgregarServicio);
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);


        // OnClickListener botón "Agregar Servicio"
        btnAgregarServicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticuloServiciosActivity.this, AgregarServicioActivity.class);
                startActivity(intent);
            }
        });


        // OnClickListener botón "Agregar Producto"
        btnAgregarProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArticuloServiciosActivity.this, AgregarProductoActivity.class);
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
