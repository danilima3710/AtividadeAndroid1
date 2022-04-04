package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Ciclo de Vida Activity ", "onCreate");

        edtTexto = findViewById(R.id.edtTexto);
    }

    public void onClickAbrirTela(View view)
    {
        Intent i = new Intent(this,MainActivity2.class);
        String mensagem = edtTexto.getText().toString();
        i.putExtra("msg",mensagem);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de Vida Activity ", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de Vida Activity ", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de Vida Activity ", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de Vida Activity ", "onStop");
    }
}