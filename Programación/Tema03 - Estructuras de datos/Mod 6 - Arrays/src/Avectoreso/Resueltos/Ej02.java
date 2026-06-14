package Avectoreso.Resueltos;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
2. Crea un programa que pida diez números reales por teclado, los almacene en 
un array, y luego muestre la suma de todos los valores.
*/

/**
 *
 * @author Jesús Pérez
 */
public class Ej02 {
    public static void main(String[] args){
        double suma=0; 
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
                 suma+=reales[i];
             } catch (InputMismatchException e) {
                 System.out.println("Tipo de dato incorrecto o mal introducido");
                 sc.nextLine();
             }                 
         }
         System.out.println("suma = " + suma);
     }
}
