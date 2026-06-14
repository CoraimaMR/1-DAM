package Avectoreso.Resueltos;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*------------------------------ ENUNCIADO ---------------------------------
5. Crea un programa que pida veinte números reales por teclado, los almacene 
en un array y luego lo recorra para calcular y mostrar la media: 
(suma de valores) / nº de valores.
----------------------------------------------------------------------------
*/
/**
 *
 * @author Jesús Pérez
 */
public class Ej05 {
    public static void main(String[] args){
        final int TAMANIO=10; 
        int vector[]=new int[TAMANIO];
         Scanner sc=new Scanner(System.in);
         int suma=0;
         
         System.out.println("Introduzca números enteros:");
         for (int i = 0; i < vector.length; i++) {
             System.out.print("Número "+i+": ");
             vector[i]=sc.nextInt();
             suma+=vector[i];             
         }//for
         
         System.out.println("La media aritmética es "+(suma/TAMANIO));         
     }
}
