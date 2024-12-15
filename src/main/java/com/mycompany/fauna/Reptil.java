package com.mycompany.fauna;

public class Reptil extends Animales {
    public String escamas;

    public Reptil(String nombre, int edad,String escamas) {
        super(nombre, edad);
        this.escamas=escamas;
    }
    
    public void Arrastrarse(){
        System.out.println(nombre+" se esta arrastrando con sus escamas de tipo "+escamas+".");
    }
    
    
}
