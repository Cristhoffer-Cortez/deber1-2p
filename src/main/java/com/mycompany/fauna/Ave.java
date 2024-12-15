package com.mycompany.fauna;

public class Ave extends Animales {
    public double alas;

    public Ave(String nombre, int edad, double alas) {
        super(nombre, edad);
        this.alas=alas;
    }
    
    public void Volar(){
        System.out.println(nombre+" esta volando con una envergadura de "+alas+" metros.");
    }
    
}
