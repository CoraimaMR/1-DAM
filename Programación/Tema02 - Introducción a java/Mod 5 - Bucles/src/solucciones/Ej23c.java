/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej23c;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------

*/

/**
 * @author Jesús Pérez 
 */
public class Ej23c {

    public static void main(String[] args) {
        int num, blancosIniciales=0, blancosCentrales=1;
        int asteriscos=1;
        
        Scanner sc=new Scanner (System.in);
        
        //Pedimos el número por teclado
        System.out.println("Introduzca un número positivo: ");
        num=sc.nextInt();
        
        //Si el número no es mayor que 0, informamos y finalizamos el programa
        if (num<=0) {
            System.out.println("El número ha de ser positivo.");
        }
        else{
            
            //########### PINTO LÍNEA 1 ########### 
            //Inicializo la variable blancos
            blancosIniciales=num-1;
            
            for (int i = 1; i <= blancosIniciales; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
            
            
            //########### PINTO LÍNEAS 2 hasta num-1 ########### 
            
            for (int i = 2; i <= num-1; i++) {
                //blancos iniciales
                //Comienzan en num-1 y decrementan de 1 en 1
                blancosIniciales--;
                for (int j = 1; j <= blancosIniciales; j++) {
                    System.out.print(" ");
                }
                
                System.out.print("*"); //Primer asterisco
                
                //blancos centrales
                //Comienzan en 1 y suman de 2 en 2
                for (int j = 1; j <=blancosCentrales; j++) {
                    System.out.print(" ");
                }
                
                System.out.print("*"); //Asterisco final
                
                blancosCentrales+=2;
                
                System.out.println(""); //Salto de línea
                
            }//for central
            
            
            //########### PINTO LÍNEA FINAL ########### 
            //Se añade condición '&&num!=1' para que no entre en el bucle si
            //el número de filas es 1
            for (int i = 0; i < 2*num-1&&num!=1; i++) {
                System.out.print("*");
            }//for última fila
            System.out.println("");
        }//else
        
    }//main

}//class
