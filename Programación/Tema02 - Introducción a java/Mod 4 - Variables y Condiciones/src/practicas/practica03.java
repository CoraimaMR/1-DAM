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
public class practica03 {

    //3. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
    
    public static void main(String[] args) {
        
        int area;
        int lado;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el valor del lado:");
        lado=sc.nextInt();
        
        area=lado*lado;
        
        System.out.println("El valor del area de lado "+lado+" es de "+area);
    }
    
}
