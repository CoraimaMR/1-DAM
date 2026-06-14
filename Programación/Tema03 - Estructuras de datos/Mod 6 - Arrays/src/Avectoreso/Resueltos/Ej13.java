package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++++++
13. Crea un programa que permita al usuario almacenar una secuencia aritmética 
en un array y luego mostrarla. Una secuencia aritmética es una serie de números 
que comienza por un valor inicial V, y continúa con incrementos de I. 
Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, 
la secuencia sería 7, 17, 27, 37… 
El programa solicitará al usuario V, I además de N (nº de valores a crear).
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej13 {
    public static void main(String[] args) {
        int inicio, incremento, tamanio;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Introduzca el valor inicial de la secuencia: ");
        inicio=sc.nextInt();
        
        System.out.print("Introduzca el incremento: ");
        incremento=sc.nextInt();
        
        System.out.print("Introduzca el número total de elementos: ");
        tamanio=sc.nextInt();
        int[] secuencia= new int[tamanio];
        
        secuencia[0]=inicio;
        
        System.out.print(secuencia[0]+" ");
        for (int i = 1; i < secuencia.length; i++) {
            secuencia[i]=secuencia[i-1]+incremento;
            System.out.print(secuencia[i]+" ");
        }//for
        System.out.println("");
        
    }//main
}
