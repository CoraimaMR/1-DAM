/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class practica09{
    /*
    8. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de
edad” solo si lo somos.
    */
    
    public static void main(String[] args) {
        
        int edad;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad:");
        edad = sc.nextInt();
        
        if (edad>=18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
