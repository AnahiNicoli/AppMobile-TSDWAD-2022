package com.angelsmart86.budgetwiseactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class IniciarSesionActivity2 extends AppCompatActivity {

    Button btn_Volver;
    TextView registroText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion2);

        btn_Volver = findViewById(R.id.btn_volver);
        btn_Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IniciarSesionActivity2.this, MainActivity.class);
                startActivity(intent);
            }

        });

        registroText = findViewById(R.id.registroText);
        registroText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IniciarSesionActivity2.this, RegistroActivity3.class);
                startActivity(intent);
            }

        });
    }
}
