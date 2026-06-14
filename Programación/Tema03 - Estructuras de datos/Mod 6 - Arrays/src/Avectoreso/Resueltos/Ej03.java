package Avectoreso.Resueltos;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesús Pérez
 */
public class Ej03 {
    public static void main(String[] args){
        double max=Double.MIN_VALUE;
        double min=Double.MAX_VALUE; 
        
        System.out.println(max);
        System.out.println(min);
        
        double reales[]=new double[10];
         Scanner sc=new Scanner(System.in);
         sc.useLocale(Locale.US);//Uso de punto decimal en lugar de coma
         
         System.out.println("Introduzca números con decimales...");
         
         //El algoritmo se puede mejorar con un bucle while que me pida de nuevo 
         //el dato mal introducido
         for (int i = 0; i < reales.length; i++) {
             try {
                 System.out.print("Número "+i+": ");
                 reales[i]=sc.nextDouble();
                 
                     if (reales[i]>max) {
                         max=reales[i];
                     }
                     if (reales[i]<min) {
                         min=reales[i];
                     }
                 
             } catch (InputMismatchException e) {
                 System.out.println("Tipo de dato incorrecto o mal introducido");
                 sc.nextLine();
             } //catch                
         }//for
         System.out.println("max = " + max);
         System.out.println("min = " + min);
     }
}
