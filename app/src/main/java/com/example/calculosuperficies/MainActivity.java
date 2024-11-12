package com.example.calculosuperficies;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton btnrect, btncuadrado, btnovalo, btncirculo, btntriangulo, btnrombo, btnpentagono, btnhexagono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnrect.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "rectangulo");
            startActivity(i);
        });

        btncuadrado.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "cuadrado");
            startActivity(i);
        });

        btnovalo.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "ovalo");
            startActivity(i);
        });

        btncirculo.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "circulo");
            startActivity(i);
        });

        btntriangulo.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "triangulo");
            startActivity(i);
        });

        btnrombo.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "rombo");
            startActivity(i);
        });

        btnpentagono.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "penta");
            startActivity(i);
        });

        btnhexagono.setOnClickListener(v -> {
            Intent i = new Intent(this, CalculoActivity.class);
            i.putExtra("figura", "hexa");
            startActivity(i);
        });
    }

    public void init() {
        btnrect = findViewById(R.id.btnrect);
        btncuadrado = findViewById(R.id.btncuadrado);
        btnovalo = findViewById(R.id.btnovalo);
        btncirculo = findViewById(R.id.btncirculo);
        btntriangulo = findViewById(R.id.btntriangulo);
        btnrombo = findViewById(R.id.btnrombo);
        btnpentagono = findViewById(R.id.btnpenta);
        btnhexagono = findViewById(R.id.btnhexa);
    }
}