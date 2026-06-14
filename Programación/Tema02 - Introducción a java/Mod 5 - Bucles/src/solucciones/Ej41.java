/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej41;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7

Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3
*/

/**
 * @author Jesús Pérez 
 */
public class Ej41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long numero, copia;
        int longitud=0, posicion=0;
        long truncado=0;
        
        //Pido el número por teclado y supongo que se introduce correctamente
        System.out.println("Introduzca un número: ");
        numero=sc.nextLong();
        
        //Calculo la longitud del número
        copia=numero;
        while (copia>0) {
            copia/=10;
            longitud++;
        }//wh
        
        //System.out.println("longitud = " + longitud);;
        
        //Si el número es mayor que 0 entonces calcula su posición aleatoria
        //Las posiciones se enumeran desde el 1 empezando por la izquierda
        if (numero>0) {
            //Calculo la posición aleatoria
            posicion=(int)(1+Math.random()*longitud);
            System.out.println("posicion = " + posicion);

            //Parto el número de manera que el dígito aleatorio se quede en las unidades
            truncado=(numero/(long)Math.pow(10,longitud-posicion));
            System.out.println("El dígito aleatorio es el "+(truncado%10));       
        }//if     
        
    }//main
}//class
