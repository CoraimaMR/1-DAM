/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
********************************** ENUNCIADO ********************************
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares 
hay dentro de un número.
*****************************************************************************
*/

package Ej35;
import java.util.*;

/**
 *
 * @author Jesús Pérez
 */
public class Ej35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=0, digito=0;
        int pares=0, impares=0;
        boolean repite;
        Scanner sc=new Scanner(System.in);
        
        //Solicitamos el número entero. Usamos una excepción dentro de un bucle
        //para evitar errores con el tipo de dato
        do {
            repite=false;
            try {
                System.out.println("Introduzca un número entero: ");
                num=sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: el tipo de dato introducido no es un entero");
                sc.nextLine();
                repite=true;
        } 
        } while (repite);
        
        //Si el número es negativo, lo multiplicamos por -1
        if (num<0) {
            num*=(-1);
        } 
       
        while (num>0) {
            digito=num%10;
            num/=10;
            if (digito%2==0) {
                pares++;
            }else{
                impares++;
            }
        }
        
        System.out.println("impares = " + impares);
        System.out.println("pares = " + pares);
                
    }
    
}
