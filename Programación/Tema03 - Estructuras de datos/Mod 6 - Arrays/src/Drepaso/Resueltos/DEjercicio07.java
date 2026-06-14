/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* RELACIÓN D EJERCICIO 7
Un anagrama es una palabra que resulta del cambio del orden de los caracteres 
de otra. Ejemplos de anagrama de la palabra roma son amor, ramo o mora. 
Construir un programa que solicite al usuario dos palabras e indique si son 
anagramas una de la otra.
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio07 {
    public static void main(String[] args) {
        String palabra1, palabra2;
        Scanner sc=new Scanner(System.in);
        boolean esAnagrama=true;
        int i=0;
        char c;
        
        System.out.print("Introduzca una palabra: ");
        palabra1=sc.nextLine();
        
        System.out.print("Introduzca otra palabra: ");
        palabra2=sc.nextLine();
        
        if (palabra1.length()!=palabra2.length()) {
            System.out.println("Al tener diferentes longitudes, no son anagramas.");
        } else {
            palabra1=palabra1.toLowerCase();
            palabra2=palabra2.toLowerCase();
            
            for (int j = 0; j < palabra1.length()&&esAnagrama; j++) {
                c=palabra1.charAt(j);
                if (palabra2.indexOf(c)==-1) {
                    esAnagrama=false;
                } 
                
            }//for
                                  
            if (esAnagrama) {
                System.out.println("Son anagramas");
            } else{
                System.out.println("No son anagramas");
            }
           
        }//else
        
    }//main
}
