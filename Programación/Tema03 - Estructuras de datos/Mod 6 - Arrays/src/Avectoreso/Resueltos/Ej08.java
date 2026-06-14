package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
++++++++++++++++++++++++++++++++ ENUNCIADO ++++++++++++++++++++++++++++++++++++
8. Crea un programa que cree un array con 100 números reales aleatorios entre 
0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. 
Por último, mostrará cuántos valores del array son igual o superiores a R.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej08 {
    public static void main(String[] args) {
        double real;
        int contador=0;
        Scanner sc=new Scanner(System.in);
        
        sc.useLocale(Locale.US);//Uso del punto decimal
       
        double vector[]=new double[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=Math.random();            
        }
        
        System.out.print("Introduzca un valor decimal: ");
        real=sc.nextDouble();
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>=real) {
                contador++;
            }           
        }//for
        
        System.out.println("contador = " + contador);
        
    }//main
}
