/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
******************************* ENUNCIADO *********************************
Escribe un programa que lee un número y me dice si es positivo o negativo, 
consideraremos el cero como positivo.
***************************************************************************
*/

package solucciones;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;
       
       Scanner sc= new Scanner(System.in);
       
        System.out.println("Introduzca un número");
        a = sc.nextInt();
        
       if (a>=0) {
            System.out.println("El número es positivo");
       } else {
            System.out.println("El número es negativo");
       }
    }
    
}
