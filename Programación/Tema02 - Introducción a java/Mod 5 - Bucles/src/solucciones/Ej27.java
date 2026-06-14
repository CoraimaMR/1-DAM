/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/********************************* ENUNCIADO **********************************
 * 27. Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. 
 * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud 
 * de la mitad (división entera entre 2) de la altura más uno.
 ******************************************************************************
*/

package ej27;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud;
        Scanner sc=new Scanner(System.in);
        
        //Pedimos la longitud de la L por teclado
        System.out.print("Introduzca la longitud de la L: ");
        longitud=sc.nextInt();
        System.out.println("");
        
        //Pintamos longitud-1 *
        for (int i = 1; i < longitud; i++) {
            System.out.println("*");
        }
        
        //Pintamos el palo horizontal de la L
        for (int i = 1; i <= (longitud/2+1); i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }//main
    
}//class
