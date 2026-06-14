/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/******************************* ENUNCIADO ************************************
20. Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre 
* por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada 
* número tantas veces como su valor.
* *****************************************************************************
*/

package solucciones;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca un número entre 0 y 20: ");
        num=sc.nextInt();
        System.out.println("");
        
        if (num<0||num>20) {
            System.out.println("El número ha de estar comprendido entre "
                    + "0 y 20");
        } else {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println("");
            }
        }
    }
    
}
