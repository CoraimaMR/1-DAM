package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++ ENUNCIADO ++++++++++++++++++++++++++++++++++
9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene 
con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). 
Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej09 {
    public static void main(String[] args) {
        int n;
        int[] vector=new int[100];
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca un número entre 1 y 10");
        n=sc.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10)+1;  
            if (vector[i]==n) {
                System.out.print(i+"\t");
            }
        }
        
        System.out.println("Posiciones que coinciden con "+n);
        System.out.println("");
        
    }//main
}//class
