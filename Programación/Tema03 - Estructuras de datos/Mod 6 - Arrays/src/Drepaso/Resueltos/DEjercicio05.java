  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* RELACIÓN D - EJERCICIO 5
Crea un programa que lea por teclado una cadena de caracteres e indique la 
cantidad de palabras que tiene. De la clase String, sólo se pueden utilizar l
os métodos length(), charAt() y trim().
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio05 {
    public static void main(String[] args) {
        String frase;
        Scanner sc=new Scanner(System.in);
        int palabras=1;
        String alfabeto="abcdefghijklmnñopqrstuvwxyz";
        
        System.out.println("Introduzca una frase: ");
        frase=sc.nextLine();
        
        //frase=frase.trim();//Recorta espacios iniciales y finales
                             //No es necesario .trim()
                             
        frase=frase.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ' && (alfabeto.indexOf(frase.charAt(i+1)))>0) {
                palabras++;
            }
        }//for
        
        
        
        System.out.println("palabras = " + palabras);
    }//main
}
