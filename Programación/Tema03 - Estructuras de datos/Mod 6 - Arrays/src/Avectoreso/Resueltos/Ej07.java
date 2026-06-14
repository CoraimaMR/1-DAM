package Avectoreso.Resueltos;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*----------------------------ENUNCIADO -----------------------------------
7. Crea un programa que pida dos valores enteros P y Q, luego cree un array 
que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
---------------------------------------------------------------------------
*/

/**
 *
 * @author Jesús Pérez
 */
public class Ej07 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int p, q;
        
        //Suponemos que el usuario introduce correctamente los datos
        System.out.print("Valor inicial P: ");
        p = entrada.nextInt();
        System.out.print("Valor final Q: ");
        q = entrada.nextInt();

        // Creamos el array de tamaño (Q - P + 1)
        int vector[] = new int[q - p + 1];
        
        // En cada posición (i) insertamos (P + i)
        for (int i = 0; i < vector.length; i++) {
            vector[i] = p + i;
        }

        // Mostramos el array
        System.out.print("Array: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
