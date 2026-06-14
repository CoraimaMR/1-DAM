/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/******************************** ENUNCIADO ***********************************
24. Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.
* *****************************************************************************
*/

package ej24b;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej24b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, a=0, b=1, siguiente=0;
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.print("Introduce el número de términos de la sucesión de Fibonacci: ");
            n = sc.nextInt();
        } while (n<0);


        System.out.println("Sucesión de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
        
    }//main
    
}//class
