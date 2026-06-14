package Avectoreso.Resueltos;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesús Pérez
 */
public class Ej06 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int tamaño, num;
         
         System.out.println("Introduzca el tamaño:");
         tamaño=sc.nextInt();
         int vector[]=new int[tamaño];
         
         System.out.println("Introduzca un valor: ");
         num=sc.nextInt();
         
         for (int i = 0; i < vector.length; i++) {
             vector[i]=num;   
             System.out.print(vector[i]+"\t");
         }//for
                 
     }
}
