/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/****************************** ENUNCIADO *************************************
 * 26. Realiza un programa que pida un número por teclado y que luego muestre 
 * ese número al revés.
 ******************************************************************************
*/

package ej26;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, copia, alReves;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduzca un número entero: ");
        numero = sc.nextInt();

        copia = numero;
        alReves = 0;
    
    while (copia > 0) {
      alReves = (alReves * 10) + (copia % 10);
      copia /= 10;
    } // while
    
    System.out.print("Si le damos la vuelta al " + numero);
    System.out.println(" tenemos el " + alReves + ".");
    }
    
}
