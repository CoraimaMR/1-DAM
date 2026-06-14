/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**************************** ENUNCIADO ************************************
25. Escribe un programa que lea un número n e imprima una pirámide de 
* números con n filas como en la siguiente figura:
   1
  121
 12321
1234321
****************************************************************************
*/
package ej25;
import java.util.Scanner;
/**
 *
 * @author Jesús Pérez
 */
public class Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int filas=0;
       int blancos=0, digitos=0, central=0;
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Introduzca el número de filas de la pirámide:");
        filas=sc.nextInt();
        
        blancos=filas;
        digitos=1;
        //Hacemos un primer bucle con tantos saltos como filas solicitadas
        for (int i = 1; i <= filas; i++) {
            //Imprimos blancos, que en el primera fila son tantos como el 
            //número de filas pedido, y se decrementan en 1
            for (int j = 1; j <= blancos; j++) {
                System.out.print(" ");
            }//for blancos
            
            //Imprimimos dígitos. El valor central es el número de la fila.
            //Lo imprimimos y cuando llegamos al tope, usamos la variable 
            //decre para contar hacia atrás.
            central=i;
            for (int j = 1; j <= digitos; j++) {
                if (j<=i) {
                    System.out.print(j);                    
                } else {
                    central--;
                    System.out.print(central);                    
                }//if
                
            }//for dígitos
            
            //Al final de cada fila:
            //Decremento el número de espacios en blanco
            //Le sumo 2 a los dígitos
            blancos--;
            digitos+=2;
            System.out.println("");
 
        }//for externo
       
    }//main
    
}//class
