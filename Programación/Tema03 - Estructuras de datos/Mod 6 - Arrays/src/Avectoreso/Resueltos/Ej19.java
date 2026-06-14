package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
++++++++++++++++++++++++++++++++++++ ENUNCIADO +++++++++++++++++++++++++++++++++
19. Necesitamos crear un programa para mostrar el ranking de puntuaciones de un 
torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las 
puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, 
de tipo entero) y luego muestre las puntuaciones en orden descendente 
(de la más alta a la más baja).
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Jesús Pérez
 */
public class Ej19 {
    public static void main(String[] args) {
        int puntos[]=new int[8];
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduzca la puntuación de los jugadores");
        for (int i = 0; i < puntos.length; i++) {
            System.out.print("Jugador "+(i+1)+": ");
            puntos[i]=sc.nextInt();
        }
        
        Arrays.sort(puntos);
        
        System.out.println("Las puntuaciones ordenadas son: ");
        for (int i = (puntos.length-1); i >= 0; i--) {
            System.out.print(puntos[i]+" ");            
        }
        System.out.println("");
    }//main
}
