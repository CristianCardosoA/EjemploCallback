package com.example.interfaces;

import java.util.Random;

public class Animal {

    OnCLickAnimal callback;

    public Animal(){
    }

    void setCallback(OnCLickAnimal onCLickAnimal){
        this.callback = onCLickAnimal;
    }

    @Override
    public String toString() {

        this.callback.mostrar(new Random().nextInt());
        this.callback.borrar();

        return "Animal{" +
                "callback=" + callback +
                '}';
    }

    void crear(){

        this.callback.mostrar(new Random().nextInt());
    }
}
