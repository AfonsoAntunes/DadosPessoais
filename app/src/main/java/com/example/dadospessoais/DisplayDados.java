package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dados);

        Intent intent = getIntent();

        String edit_name = intent.getStringExtra(MainActivity.EXTRA_NOME);
        TextView textViewNome = findViewById(R.id.textViewNome);
        textViewNome.setText(edit_name);

        String edit_telefone = intent.getStringExtra(MainActivity.EXTRA_TELEFONE);
        TextView textViewTelefone = findViewById(R.id.textViewTelefone);
        textViewTelefone.setText(edit_telefone);

        String edit_maeil = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        textViewEmail.setText(edit_maeil);

        /* Integer edit_idade = intent.getIntExtra(MainActivity.EXTRA_IDADE, 0);
        TextView textViewIdade = findViewById(R.id.textViewIdade);
        textViewIdade.setText(edit_idade); */

        Float edit_peso = intent.getFloatExtra(MainActivity.EXTRA_PESO, 0);
        TextView textViewPeso = findViewById(R.id.textViewPeso);
        textViewPeso.setText(String.valueOf(edit_peso));

        Float edit_altura = intent.getFloatExtra(MainActivity.EXTRA_ALTURA, 0);
        TextView textViewAltura = findViewById(R.id.textViewAltura);
        textViewAltura.setText(String.valueOf(edit_altura));
    }
}
