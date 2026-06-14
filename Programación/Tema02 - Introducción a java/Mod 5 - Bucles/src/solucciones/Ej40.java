/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej40;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
*/

/**
 * @author Jesús Pérez 
 */
public class Ej40 {

    public static void main(String[] args) {
        int numero;
        boolean esPrimo=true;
        
        for (int i = 0; i < 100; i++) {
            numero = (int)(Math.random() * 191) + 10;

            // Comprueba si el número es primo
            for (int j = 2; j <= Math.sqrt(numero); j++) {
              if ((numero % j) == 0) {
                esPrimo = false;
              }
            }

            if (esPrimo) {
              System.out.print("#" + numero + "#  ");
            } else 
                if ((numero % 5) == 0) {// múltiplo de 5
                    System.out.print("[" + numero + "]  ");
                } else {
                    System.out.print(numero + "  ");
            }//else
            
        } // for
        
    }//main

}//class
