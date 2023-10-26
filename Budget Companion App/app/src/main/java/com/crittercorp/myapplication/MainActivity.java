package com.crittercorp.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método para manejar el clic del botón "Ir a Presupuestos"
    public void navegarAPresupuestos(View view) {
        Intent intent = new Intent(this, MisPresupuestos.class);
        startActivity(intent);
    }

}