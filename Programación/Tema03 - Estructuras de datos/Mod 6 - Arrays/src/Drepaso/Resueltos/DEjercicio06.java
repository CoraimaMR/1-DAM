/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* RELACIÓN D - EJERCICIO 6
Escribir un programa que pida el nombre completo al usuario y lo muestre sin 
vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, "Jesús Pérez" se 
mostrará "Jss Prz"
*/

import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class DEjercicio06 {
    public static void main(String[] args) {
        String nombre;
        String vocales="aeiouáéíóúü";
        char c;
        boolean esVocal=false;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escriba su nombre y apellidos: ");
        nombre=sc.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            //Convertimos el caracter actual a mínusculas
            c=Character.toLowerCase(nombre.charAt(i));
            if (vocales.indexOf(c)==-1) {
                System.out.print(nombre.charAt(i));
                //esVocal=false;
            } else {
                //esVocal=true;
            }//else
                   
        }//for
        
    }//main
}
