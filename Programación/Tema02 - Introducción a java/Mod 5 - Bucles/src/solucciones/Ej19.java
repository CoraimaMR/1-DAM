/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/******************************** ENUNCIADO **********************************
 19. Realiza un programa que lea un número y a continuación escriba el carácter
 “*” tantas veces igual al valor numérico leído. En aquellos casos en que el 
 * valor leído no sea positivo se deberá escribir un único asterisco.
 * ***************************************************************************

*/
package solucciones;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca un número positivo: ");
        num=sc.nextInt();
        
        System.out.print("*");
        for (int i = 2; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
//        if (num<0) {
//            System.out.println("*");
//        } else {
//            if (num==0) {
//                System.out.println("Ha introducido un 0");
//            } else {
//                for (int i = 0; i < num; i++) {
//                    System.out.print("*");
//                }
//                System.out.println("");
//            }
//        }
    }
    
}
