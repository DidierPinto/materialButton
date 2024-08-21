package com.example.materialbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private Button material;
    private MaterialButton responder;
    private Button terminar;
    private Button consejos;
    private Button numero1;
    private Button numero2;
    private Button numero3;
    private Button numero4;
    private Button numero5;
    private Button numero6;
    private Button numero7;
    private Button numero8;
    private Button numero9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        material = findViewById(R.id.button2);
        responder = findViewById(R.id.responder1);
        terminar = findViewById(R.id.button14);
        consejos = findViewById(R.id.consejosid);
        numero1 = findViewById(R.id.button3);
        numero2 = findViewById(R.id.button4);
        numero3 = findViewById(R.id.button5);
        numero4 = findViewById(R.id.button8);
        numero5 = findViewById(R.id.button9);
        numero6 = findViewById(R.id.button10);
        numero7 = findViewById(R.id.button11);
        numero8 = findViewById(R.id.button12);
        numero9 = findViewById(R.id.button13);

        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Silenciar Llamada", Toast.LENGTH_SHORT).show();
            }
        });

        responder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Responder Llamada", Toast.LENGTH_SHORT).show();
            }
        });

        terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Terminar Llamada", Toast.LENGTH_SHORT).show();
            }
        });

        consejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "¿Seguro Deseas Llamar?", Toast.LENGTH_SHORT).show();
            }
        });

        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
            }
        });

        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
            }
        });

        numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
            }
        });
        numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
            }
        });
        numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
            }
        });
        numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
            }
        });
        numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
            }
        });
        numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "8", Toast.LENGTH_SHORT).show();
            }
        });
        numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "9", Toast.LENGTH_SHORT).show();
            }
        });
    }
}