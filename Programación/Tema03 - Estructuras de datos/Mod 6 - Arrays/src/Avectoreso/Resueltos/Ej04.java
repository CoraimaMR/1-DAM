package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
   
/*------------------------------ ENUNCIADO ----------------------------------
4. Crea un programa que pida veinte números enteros por teclado, los 
   almacene en un array y luego muestre por separado la suma de todos los 
   valores positivos y negativos.
-----------------------------------------------------------------------------
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej04 {
     public static void main(String[] args){
         int vector[]=new int[10];
         Scanner sc=new Scanner(System.in);
         int sumaPositivos=0, sumaNegativos=0;
         
         System.out.println("Introduzca enteros positivos o negativos: ");
         for (int i = 0; i < vector.length; i++) {
             System.out.print("Número "+i+": ");
             vector[i]=sc.nextInt();
             if (vector[i]>=0) {
                 sumaPositivos+=vector[i];
             } else {
                 sumaNegativos+=vector[i];
             }
             
         }//for
         
         System.out.println("sumaPositivos = " + sumaPositivos);
         System.out.println("sumaNegativos = " + sumaNegativos);
         
     }
}
