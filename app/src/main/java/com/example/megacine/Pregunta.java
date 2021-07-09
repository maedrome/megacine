package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pregunta extends AppCompatActivity {
    private TextView txtpregunta;
    private Button Btn1, Btn2, Btn3, Btn4;
    private ArrayList<String> listapreguntas = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);

        txtpregunta = (TextView) findViewById(R.id.txtpregunta);
        Btn1 = (Button) findViewById(R.id.Btn1);
        Btn2 = (Button) findViewById(R.id.Btn2);
        Btn3 = (Button) findViewById(R.id.Btn3);
        Btn4 = (Button) findViewById(R.id.Btn4);
        listapreguntas.add("El muchacho de los ojos?");
        listapreguntas.add("Reloj deten tu?");
        listapreguntas.add("Grab a brush and put a little?");
        listapreguntas.add("Another one bites the?");
    }
    public int generarnum() {
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        return n;
    }



}
