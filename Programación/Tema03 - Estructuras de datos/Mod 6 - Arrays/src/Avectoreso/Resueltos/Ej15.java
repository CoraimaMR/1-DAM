package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++++ ENUNCIADO ++++++++++++++++++++++++++++++++
15. Crea un programa que pida la usuario dos valores N y M y luego cree un 
array de tamaño N que contenga M en todas sus posiciones. Luego muestra el 
array por pantalla.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Jesús Pérez
 */
public class Ej15 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduzca el tamaño del vector: ");
        n=sc.nextInt();
        
        System.out.print("Introduzca el valor que quiere almacenar: ");
        m=sc.nextInt();
        
        int[] vector=new int[n];
        
        Arrays.fill(vector, m);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
            
        }//for
        
    }//main
}
