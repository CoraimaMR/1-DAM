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
public class practica07 {
    
    /*
    7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y
escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
    */

    public static void main(String[] args) {
    
        int millas,metros;
        
         Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el valor en millas marinas:");
        millas = sc.nextInt();
        
        metros = millas * 1852;
        
        System.out.println(millas+" millas marinas equivale a "+metros+" metros.");

    }
}
