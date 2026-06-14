package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
++++++++++++++++++++++++++++++++++  ENUNCIADO +++++++++++++++++++++++++++++++
12. Crea un programa que cree un array de 10 enteros y luego muestre el 
siguiente menú con distintas opciones:
           a. Mostrar valores.
           b. Introducir valor.
           c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. 
La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en 
la posición P del array. El menú se repetirá indefinidamente hasta que el 
usuario elija la opción ‘c’ que terminará el programa.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vector[] = new int[10];
        boolean continuar = true;
        String opcion;
        int valor, posicion;

        while (continuar) {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción y presiona intro: ");
            opcion = sc.nextLine();
            
            switch (opcion) {
                
                case "a":
                    for (int i = 0; i < vector.length; i++)
                        System.out.print(vector[i] + " ");
                    System.out.println();
                    break;
                    
                case "b":
                    
                    System.out.print("Valor: ");
                    valor = sc.nextInt();
                    System.out.print("Posición: ");
                    posicion = sc.nextInt();
                    if (posicion < 0 || posicion >= vector.length)
                        System.out.println("Posición fuera del límite");
                    else
                        vector[posicion] = valor;
                    break;
                    
                case "c":
                    System.out.println("Fin del programa");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            sc.nextLine();
        }
    }
}
