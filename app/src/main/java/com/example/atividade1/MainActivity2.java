package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtTexto = findViewById(R.id.txtTexto);

        Bundle bundle = getIntent().getExtras();
        String sTexto = bundle.getString("msg");
        txtTexto.setText(sTexto);
    }
}