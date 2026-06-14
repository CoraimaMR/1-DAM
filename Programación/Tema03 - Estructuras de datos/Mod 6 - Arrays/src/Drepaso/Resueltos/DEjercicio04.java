/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* RELACIÓN D- EJERCICIO 4
Crea un algoritmo que pida 5 palabras por teclado y que al final nos muestre la 
de mayor y menor longitud. Si coinciden dos o más palabras con la mayor o menor
longitud, entonces se mostrará la primera que se introdujo.
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio04 {
    public static void main(String[] args) {
        String palabra="", palabraMax="", palabraMin="";
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la palabra número "+(i+1)+": ");
            palabra=sc.nextLine();
            
            //Inicializamos palabraMin a la primera palabra introducida
            if (i==0) {
                palabraMin=palabra;
            }
            
            if (palabra.length()>palabraMax.length()) 
                palabraMax=palabra;
             else 
                if (palabra.length()<palabraMin.length()) 
                    palabraMin=palabra;
                       
        }//for
        System.out.println("La palabra de mayor longitud es "+palabraMax);
        System.out.println("La palabra de menor longitud es "+palabraMin);
    }//main
}
