package com.example.paneles_00060917;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private LinearLayout red_layout, green_layout, blue_layout;
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red_layout = findViewById(R.id.red);
        green_layout = findViewById(R.id.green);
        blue_layout = findViewById(R.id.blue);
        red_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Genera el numero aleatorio entre 75 y 255, para que el color no tienda a verse casi negro
                numero = (int) ((Math.random() * (255 - 75 + 1)) + 75);
                red_layout.setBackgroundColor(Color.rgb(numero, 0, 0));
            }
        });
        green_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero = (int) ((Math.random() * (255 - 75 + 1)) + 75);
                green_layout.setBackgroundColor(Color.rgb(0, numero, 0));
            }
        });
        blue_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero = (int) ((Math.random() * (255 - 75 + 1)) + 75);
                blue_layout.setBackgroundColor(Color.rgb(0, 0, numero));
            }
        });
    }
}
