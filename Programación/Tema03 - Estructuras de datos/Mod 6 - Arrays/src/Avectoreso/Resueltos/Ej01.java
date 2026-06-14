package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
1. Crea un programa que pida diez números reales por teclado, los almacene 
en un array, y luego muestre todos sus valores.
*/

import java.util.*;

/**
 *
 * @author Jesús Pérez
 */
public class Ej01 {
     public static void main(String[] args){
         double reales[]=new double[10];
         boolean fallo=false;
         
         Scanner sc=new Scanner(System.in);
         sc.useLocale(Locale.US);//Uso de punto decimal en lugar de coma
         
         System.out.println("Introduzca números con decimales...");
         
         //El algoritmo se puede mejorar con un bucle while que me pida de nuevo 
         //el dato mal introducido
         for (int i = 0; i < reales.length; i++) {
            do {                 
                fallo=false;
                try {
                    System.out.print("Número "+i+": ");
                    reales[i]=sc.nextDouble();  
                } catch (InputMismatchException e) {
                    fallo=true;   
                    System.out.println("Tipo de dato incorrecto o mal introducido");
                    sc.nextLine();
                }//try
            } while (fallo);
                             
         }//for
         
         for (int i = 0; i < reales.length; i++) {
             System.out.println(reales[i]+"\t");
             
         }
     }
}
