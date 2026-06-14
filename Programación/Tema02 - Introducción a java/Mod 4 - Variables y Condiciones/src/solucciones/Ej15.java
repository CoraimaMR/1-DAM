/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
******************************** ENUNCIADO ***********************************
Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
******************************************************************************
*/

package solucciones;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el valor de a:");
        a=sc.nextInt();
        
        System.out.println("Introduce el valor de b:");
        b=sc.nextInt();
        
        System.out.println("Introduce el valor de c:");
        c=sc.nextInt();
        
      if(a > b)
        {
            if(a > c)
                System.out.println("El mayor es " + a);
            else
                System.out.println("El mayor es " + c);
        }
        else
        {
            if(b > c)
                System.out.println("El mayor es " + b);
            else
                System.out.println("El mayor es " + c);
        }            
    }//main
    
}//class
    