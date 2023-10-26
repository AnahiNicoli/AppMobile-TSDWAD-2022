package com.crittercorp.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class ListaClientesActivity extends AppCompatActivity {

    private ListView listaClientesListView;
    private ArrayList<String> listaDeClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);

        listaClientesListView = findViewById(R.id.listViewClientes);
        listaDeClientes = new ArrayList<>();
        ImageView iconoSuperiorIzquierdo = findViewById(R.id.iconoSuperiorIzquierdo);


        listaDeClientes.add("Cliente 1");
        listaDeClientes.add("Cliente 2");
        listaDeClientes.add("Cliente 3");
        listaDeClientes.add("Cliente 4");
        listaDeClientes.add("Cliente 5");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDeClientes);
        listaClientesListView.setAdapter(adapter);

        iconoSuperiorIzquierdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}
