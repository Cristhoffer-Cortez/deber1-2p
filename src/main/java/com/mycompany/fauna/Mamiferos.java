package com.mycompany.fauna;

public class Mamiferos extends Animales {
    public String pelaje;

    public Mamiferos(String nombre, int edad,String pelaje){
        super(nombre, edad);
        this.pelaje=pelaje;
    }
    
    public void Amamantar(){
        System.out.println(nombre+" con pelaje de tipo "+pelaje+" esta amamantando a sus crias.");
    } 
 
    
}
