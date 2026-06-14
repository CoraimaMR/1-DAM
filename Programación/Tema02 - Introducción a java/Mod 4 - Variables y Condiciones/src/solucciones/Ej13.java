/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
********************************** ENUNCIADO ******************************
Escribe un programa que lee dos números y los visualiza en orden ascendente.
***************************************************************************
*/

package solucciones;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el valor de a:");
        a=sc.nextInt();
        
        System.out.println("Introduce el valor de b:");
        b=sc.nextInt();
        
        if (a>=b) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        } else {
            System.out.println("b = " + b);
            System.out.println("a = " + a);
        }
        
    }
    
}
