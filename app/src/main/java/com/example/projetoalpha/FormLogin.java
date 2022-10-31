package com.example.projetoalpha;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();

        text_tela_cadastro.setOnContextClickListener(new View.OnClickListener() {
        @Override
       public void onClick(View v) {

            Intent intent = new Intent(FormLogin.this,FormCadastro.class);
           StartActivity(intent);        }
        });
    }

    private void StartActivity; IniciarComponentes () {

    text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }

    }