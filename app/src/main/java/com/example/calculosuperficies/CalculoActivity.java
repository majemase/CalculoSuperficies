package com.example.calculosuperficies;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class CalculoActivity extends AppCompatActivity {

    ImageView imgfigura;
    TextView lbltitulo, lblsol;
    EditText inmayor, inmenor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Intent i = getIntent();
        init();
        figuraSel(i.getStringExtra("figura"));
    }

    public void init(){
        imgfigura = findViewById(R.id.imgfigura);
        lbltitulo = findViewById(R.id.lbltitulo);
        lblsol = findViewById(R.id.lblsol);
        inmayor = findViewById(R.id.inmayor);
        inmenor = findViewById(R.id.inmenor);
    }

    public void figuraSel(String figura){
        switch(figura){
            case "rectangulo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_rect));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.rectangulo));
                break;

            case "cuadrado":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_cuadrado));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cuadrado));
                break;

            case "ovalo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_ovalo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ovalo));
                break;

            case "circulo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_circulo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.circulo));
                break;

            case "triangulo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_triangulo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.triangulo));
                break;

            case "rombo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_rombo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.rombo));
                break;

            case "penta":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_penta));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pentagono));
                break;

            case "hexa":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_hexa));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.hexagono));
                break;
        }
    }
}
