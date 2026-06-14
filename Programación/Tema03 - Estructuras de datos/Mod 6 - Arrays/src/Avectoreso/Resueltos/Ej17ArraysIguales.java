package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++
17. Crea un programa que pida al usuario 20 valores enteros e introduzca los 
10 primeros en un array y los 10 últimos en otro array. Por último, comparará 
ambos arrays y le dirá al usuario si son iguales o no.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.*;

/**
 *
 * @author Jesús Pérez
 */
public class Ej17ArraysIguales {
    public static void main(String[] args) {
        int v1[]=new int[6];
        int v2[]=new int[6];
        int valor;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca 12 valores enteros:");
        
        for (int i = 0; i < v1.length; i++) {
            valor=sc.nextInt();
            v1[i]=valor;            
        }//fori v1
        
        for (int i = 0; i < v2.length; i++) {
            valor=sc.nextInt();
            v2[i]=valor;            
        }//fori v2
        
        if (Arrays.equals(v1, v2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO son iguales");
        }
        
    }//main
}
