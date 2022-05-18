package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CafeBadilico_activity extends AppCompatActivity {

    CardView idCardView;
    Button Botao1;
    Button Botao2;
    Button Botao3;
    Button Botao4;
    Button Reserva;
    FloatingActionButton idFABCafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_badio_layout);

        idCardView = findViewById(R.id.idCardView);

        idCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Botao1 = findViewById(R.id.Botao1);

        Botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                "reservou 5:30PM paizão",
                        Toast.LENGTH_LONG).show();
            }
        });
        Botao2 = findViewById(R.id.Botao2);

        Botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "reservou 7:30PM paizão",
                        Toast.LENGTH_LONG).show();
            }
        });
        Botao3 = findViewById(R.id.Botao3);

        Botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "reservou 8:00PM paizão",
                        Toast.LENGTH_LONG).show();
            }
        });
        Botao4 = findViewById(R.id.Botao4);

        Botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "reservou 9:00PM paizão",
                        Toast.LENGTH_LONG).show();
            }
        });
        Reserva = findViewById(R.id.Reserva);

        Reserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "reservou parabéns!",
                        Toast.LENGTH_LONG).show();
            }
        });
        idFABCafe = findViewById(R.id.idFABCafe);

        idFABCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no barato!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }}