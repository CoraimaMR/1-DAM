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

package ej24;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Necesitamos variables para 3 términos
        int t1=0, t2=1, t3=0;
        
        //Número de términos a introducir por el usuario
        int n;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca el término límite:");
        n=sc.nextInt();
        
        if (n<3) {
            switch (n) {
                case 0:
                    System.out.println("No puedo mostrar términos.");
                    break;
                case 1:
                    System.out.print(t1);
                break;
                case 2:
                    System.out.print(t1);
                    System.out.print(" "+t2);
                break;
                default:
                    System.out.println("No se permiten números negativos");
            }
        } else {
            //Imprimo los dos primeros términos
            System.out.print(t1);
            System.out.print(" "+t2);
        
            //Imprimo los términos sucesivos, que son la suma de los dos anteriores
            for (int i = 3; i <= n; i++) {
                t3=t1+t2;
                System.out.print(" "+t3);
                t1=t2;
                t2=t3;           
            }//for
        }       
        
        System.out.println("");
        
    }//main
    
}//class
