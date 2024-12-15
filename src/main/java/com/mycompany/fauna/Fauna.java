package com.mycompany.fauna;

import java.util.Scanner;

public class Fauna {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcion;
        int edad1,edad2,edad3=0;
        String nombre1,nombre2,nombre3;
        String atributo1,atributo3;
        double atributo2;
                
        System.out.println("-----------------BIENBENIDO-------------------");
        System.out.println("Escriba con que tipo de animal desea trabajar.");
        System.out.println("1.Mamiferos");
        System.out.println("2.Aves");
        System.out.println("3.Reptiles");
        opcion=scanner.nextInt();
        scanner.nextLine();
        
        switch(opcion){
            case 1:
                System.out.println("Elije el nombre del mamifero.");
                nombre1=scanner.nextLine();
                
                System.out.println("Coloca la edad del mamifero.");
                edad1=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Coloca el tipo de pelaje del mamifero.");
                atributo1=scanner.nextLine();
                
                Mamiferos mamifero=new Mamiferos(nombre1,edad1,atributo1);
                System.out.println("");
                mamifero.Comer();
                mamifero.Amamantar();
                mamifero.Dormir();
                break;
            case 2:
                System.out.println("Elije el nombre del ave.");
                nombre2=scanner.nextLine();
                
                System.out.println("Coloca la edad del ave.");
                edad2=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Coloca el tamaño de las alas del ave.");
                atributo2=scanner.nextDouble();
                Ave ave=new Ave(nombre2,edad2,atributo2);
                System.out.println("");
                ave.Comer();
                ave.Volar();
                ave.Dormir();
                break;
            case 3:
                System.out.println("Elije el nombre del reptil.");
                nombre3=scanner.nextLine();
                
                System.out.println("Coloca la edad del reptil.");
                edad3=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Coloca el tipo de escamas del reptil.");
                atributo3=scanner.nextLine();
                Reptil reptil=new Reptil(nombre3,edad3,atributo3);
                System.out.println(" ");
                reptil.Comer();
                reptil.Arrastrarse();
                reptil.Dormir();
                break;
            default:
                System.out.println("Opcion no valida");               
        }
                                                  
    }
    
}
