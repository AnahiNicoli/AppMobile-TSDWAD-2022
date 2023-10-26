package com.crittercorp.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MisPresupuestos extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PresupuestoAdapter presupuestoAdapter;
    private List<Presupuesto> presupuestos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_presupuestos);

        // Inicializar vista
        recyclerView = findViewById(R.id.recyclerViewPresupuestos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        presupuestos = new ArrayList<>();

        // Presupuestos de ejemplo
        presupuestos.add(new Presupuesto("Cliente 1", "01/10/2023", "$100.00"));
        presupuestos.add(new Presupuesto("Cliente 2", "02/10/2023", "$150.00"));
        presupuestos.add(new Presupuesto("Cliente 3", "03/10/2023", "$200.00"));
        presupuestos.add(new Presupuesto("Cliente 4", "04/10/2023", "$250.00"));

        // Configurar el adaptador para el RecyclerView
        presupuestoAdapter = new PresupuestoAdapter(presupuestos);
        recyclerView.setAdapter(presupuestoAdapter);
    }



    // Métodos para navegar a otras actividades
    public void navegarANuevoPresupuesto(View view) {
        Intent intent = new Intent(this, NuevoPresupuestoActivity.class);
        startActivity(intent);
    }

    public void navegarAHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void navegarAClientes(View view) {
        Intent intent = new Intent(this, ClienteActivity.class);
        startActivity(intent);
    }

    public void navegarAProductos(View view) {
        Intent intent = new Intent(this, ArticuloServiciosActivity.class);
        startActivity(intent);
    }

    public void navegarAContacto(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}
