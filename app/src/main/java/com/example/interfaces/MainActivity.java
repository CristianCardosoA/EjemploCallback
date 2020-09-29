package com.example.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnCLickAnimal {

    Animal animal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animal1 = new Animal();
        animal1.setCallback(this);
    }

    public void mostrar(View view){

        animal1.crear();
    }

    @Override
    public void mostrar(int posicion) {
        Toast.makeText(MainActivity.this, "Hola: " + posicion, Toast.LENGTH_LONG).show();
    }

    @Override
    public void borrar() {

    }
}