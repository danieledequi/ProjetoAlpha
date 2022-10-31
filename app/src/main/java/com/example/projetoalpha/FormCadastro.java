package com.example.projetoalpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormCadastro extends AppCompatActivity {

    Button bt_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);


        bt_enviar = findViewById(R.id.bt_enviar);

        bt_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormCadastro.this,Status.class);
                StartActivity(intent);        }
        });
    }



    private void StartActivity IniciarComponentes () {
        View text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }

}