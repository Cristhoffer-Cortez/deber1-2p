package com.mycompany.fauna;

public class Animales {   
    public String nombre;
    public int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void Comer(){
        System.out.println(nombre+" esta comiendo.");
    }
    
    public void Dormir(){
        System.out.println(nombre+" esta durmiendo.");
    }
    
    
}
