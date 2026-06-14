/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/****************************** ENUNCIADO *************************************
21. Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. 
Luego visualiza los números desde A hasta B e indicar cuántos hay que sean pares.
* *****************************************************************************
*/

package solucciones;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b,pares=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce a: ");
        a=sc.nextInt();
        
        System.out.println("Introduce b: ");
        b=sc.nextInt();
        
        if (b<=a) {
            System.out.println("b tiene que ser mayor que a");
        }else{
            for (int i = a; i <=b; i++) {
                System.out.print(i);
                System.out.print(" ");
                if (i%2==0) {
                    pares++;
                }
            }
            System.out.println("");
            System.out.println("Hay "+pares+" números pares entre "+a+" y "+b);
        }
    }
    
}
