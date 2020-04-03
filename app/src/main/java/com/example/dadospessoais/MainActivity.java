package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NOME = "com.example.dadospessoais.NOME";
    public static final String EXTRA_TELEFONE = "com.example.dadospessoais.TELEFONE";
    public static final String EXTRA_EMAIL = "com.example.dadospessoais.EMAIL";
    public static final String EXTRA_IDADE = "com.example.dadospessoais.IDADE";
    public static final String EXTRA_PESO = "com.example.dadospessoais.PESO";
    public static final String EXTRA_ALTURA = "com.example.dadospessoais.ALTURA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayDados.class);

        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String edit_name = editTextNome.getText().toString();
        intent.putExtra(EXTRA_NOME, edit_name);

        EditText editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        String edit_telefone = editTextTelefone.getText().toString();
        intent.putExtra(EXTRA_TELEFONE, edit_telefone);

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String edit_maeil = editTextEmail.getText().toString();
        intent.putExtra(EXTRA_EMAIL, edit_maeil);

        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        Integer edit_idade = Integer.parseInt(editTextIdade.getText().toString());
        intent.putExtra(EXTRA_IDADE, edit_idade);

        EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        Float edit_peso = Float.parseFloat(editTextPeso.getText().toString());
        intent.putExtra(EXTRA_PESO, edit_peso);

        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        Float edit_altura = Float.parseFloat(editTextAltura.getText().toString());
        intent.putExtra(EXTRA_ALTURA, edit_altura);

        startActivity(intent);
    }
}


