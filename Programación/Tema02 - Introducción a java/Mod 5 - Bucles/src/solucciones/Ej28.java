/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/******************************* ENUNCIADO ********************************
28. Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. 
El programa pedirá la altura. El programa inserta un espacio y pinta dos 
asteriscos menos en la base para simular la curvatura de las esquinas 
inferiores.
***************************************************************************
*/

package ej28;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud;
        Scanner sc=new Scanner(System.in);
        
        //Pedimos la longitud de la L por teclado
        System.out.print("Introduzca la longitud de la U: ");
        longitud=sc.nextInt();
        System.out.println("");
        
        //Pintamos la primera parte de la U. Paramos en longitud-1
        for (int i = 1; i < longitud; i++) {
            for (int j = 1; j < longitud; j++) {
                if (j==1||j==longitud-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        // Base de la U
        
        System.out.print(" ");
        for (int i = 1; i < longitud-2; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        
//        for (int i = 1; i < longitud; i++) {
//             if (i==1||i==longitud-1) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//        }
    } 
}
