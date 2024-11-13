package com.example.calculosuperficies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class CalculoActivity extends AppCompatActivity {

    ImageView imgfigura;
    TextView lbltitulo, lblsol;
    EditText inmayor, inmenor, inradio, inlado;
    Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Intent i = getIntent();
        init();
        figuraSel(i.getStringExtra("figura"));

        btncalcular.setOnClickListener(v -> {
            Double ladomayor = 0.0, ladomenor = 0.0, radio = 0.0, lado = 0.0;
            if(!inmayor.getText().toString().isEmpty()){
                ladomayor = Double.parseDouble(inmayor.getText().toString());
            }
            if(!inmenor.getText().toString().isEmpty()){
                ladomenor = Double.parseDouble(inmenor.getText().toString());
            }
            if(!inradio.getText().toString().isEmpty()){
                ladomenor = Double.parseDouble(inradio.getText().toString());
            }
            if(!inlado.getText().toString().isEmpty()){
                ladomenor = Double.parseDouble(inlado.getText().toString());
            }

            CalcularArea(ladomayor, ladomenor, lado, radio, i.getStringExtra("figura"));
        });
    }

    public void init(){
        imgfigura = findViewById(R.id.imgfigura);
        lbltitulo = findViewById(R.id.lbltitulo);
        lblsol = findViewById(R.id.lblsol);
        inmayor = findViewById(R.id.inmayor);
        inmenor = findViewById(R.id.inmenor);
        btncalcular = findViewById(R.id.btncalcular);
        inradio = findViewById(R.id.inradio);
        inlado = findViewById(R.id.inlado);
    }

    public void figuraSel(String figura) {
        // Ocultamos todos los inputs primero
        inmayor.setVisibility(View.GONE);
        inmenor.setVisibility(View.GONE);
        inradio.setVisibility(View.GONE);
        inlado.setVisibility(View.GONE);

        switch(figura) {
            case "rectangulo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_rect));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.rectangulo));
                inmayor.setHint(R.string.str_ladomayor);
                inmenor.setHint(R.string.str_ladomenor);
                inmayor.setVisibility(View.VISIBLE);
                inmenor.setVisibility(View.VISIBLE);
                break;

            case "cuadrado":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_cuadrado));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cuadrado));
                inlado.setHint(R.string.str_lado);
                inlado.setVisibility(View.VISIBLE);
                break;

            case "ovalo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_ovalo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ovalo));
                inmayor.setHint(R.string.str_radiomayor);
                inmenor.setHint(R.string.str_radiomenor);
                inmayor.setVisibility(View.VISIBLE);
                inmenor.setVisibility(View.VISIBLE);
                break;

            case "circulo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_circulo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.circulo));
                inradio.setHint(R.string.str_radio);
                inradio.setVisibility(View.VISIBLE);
                break;

            case "triangulo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_triangulo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.triangulo));
                inmayor.setHint(R.string.str_lado);
                inmenor.setHint(R.string.str_altura);
                inmayor.setVisibility(View.VISIBLE);
                inmenor.setVisibility(View.VISIBLE);
                break;

            case "rombo":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_rombo));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.rombo));
                inmayor.setHint(R.string.str_diagonalmayor);
                inmenor.setHint(R.string.str_diagonalmenor);
                inmayor.setVisibility(View.VISIBLE);
                inmenor.setVisibility(View.VISIBLE);
                break;

            case "penta":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_penta));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pentagono));
                inlado.setHint(R.string.str_lado);
                inlado.setVisibility(View.VISIBLE);
                break;

            case "hexa":
                lbltitulo.setText(ContextCompat.getString(this, R.string.str_titulo) + " " + ContextCompat.getString(this, R.string.str_hexa));
                imgfigura.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.hexagono));
                inlado.setHint(R.string.str_lado);
                inlado.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void CalcularArea(double ladomayor, double ladomenor, double lado, double radio, String figura) {
        switch (figura) {
            case "rectangulo":
                lblsol.setText(String.valueOf(ladomayor * ladomenor));
                break;

            case "cuadrado":
                lblsol.setText(String.valueOf(Math.pow(lado, 2)));
                break;

            case "circulo":
                lblsol.setText(String.valueOf(Math.PI * Math.pow(radio, 2)));
                break;

            case "ovalo":
                lblsol.setText(String.valueOf(Math.PI * ladomayor * ladomenor));
                break;

            case "triangulo":
                lblsol.setText(String.valueOf((ladomayor * ladomenor) / 2));
                break;

            case "rombo":
                lblsol.setText(String.valueOf((ladomayor * ladomenor) / 2));
                break;

            case "pentagono":
                lblsol.setText(String.valueOf((5 * Math.pow(lado, 2)) / (4 * Math.tan(Math.PI / 5))));
                break;

            case "hexagono":
                lblsol.setText(String.valueOf((3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2));
                break;
        }
    }

}
