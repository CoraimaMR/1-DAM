package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++
20. Crea un programa que cree un array de tamaño 1000 y lo rellene con valores 
enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por 
teclado un valor N y se mostrará por pantalla si N existe en el array, además 
de cuantas veces.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Jesús Pérez
 */
public class Ej20 {
    public static void main(String[] args) {
        int vector[]=new int[1000];
        int n, j, posicion=-1, cuenta=0;
        boolean encontrado=false;
        Scanner sc=new Scanner(System.in);
        
        //Relleno el vector con valores aleatorios entre 0 y 99
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*100);            
        }//for
        
        //Solicito el valor a buscar
        System.out.print("Introduzca un valor entero entre 0 y 99: ");
        n=sc.nextInt();
        
        //Ordeno el vector para realizar la búsqueda
        Arrays.sort(vector);
        
        //Obtenemos la posición del valor buscado
        //posicion=Arrays.binarySearch(vector, n);
        for (int i = 0; i < vector.length&&!encontrado; i++) {
            if (vector[i]==n) {
                posicion=i;
                encontrado=true;
            }//if
         
        }//for
        System.out.println("posicion = " + posicion);
        
        if (posicion>-1) {//valor encontrado
            cuenta=1;
            j=posicion;
            while (vector[j]==vector[j+1]) {
                cuenta++;
                j++;
            }
            System.out.println("Valor "+n+" contenido "+cuenta+" veces.");
        } else {//El valor no está en el vector
            System.out.println("Valor no encontrado en el vector.");
        }
        
        //Muestro el vector para comprobar si todo es correcto
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
            
        }
    }//main
}//class
