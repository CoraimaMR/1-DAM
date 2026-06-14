/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej37;
import java.util.InputMismatchException;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Ej.37 (44) - Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
*/

/**
 * @author Jesús Pérez 
 */
public class Ej37 {

    public static void main(String[] args) {
        long numeroIntroducido=0, posicion=0, digito=0, copia;
        long parteIzquierda, parteDerecha;
        int longitud=0;
        
        boolean repetir;
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el NÚMERO
        do {            
            repetir=false;
            try{
                System.out.print("Por favor, introduzca un número entero positivo: ");
                numeroIntroducido = sc.nextLong();
            }
            catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
                    
        } while (repetir||numeroIntroducido<=0);
        
        //Pedimos la POSICIÓN
        do {            
            repetir=false;
            try{
                System.out.print("Introduzca la posición donde quiere insertar: ");
                posicion = sc.nextLong();
            }
            catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
                    
        } while (repetir||posicion<=0);
        
        //Pedimos el DÍGITO a insertar
        do {            
            repetir=false;
            try{
                System.out.print("Introduzca el dígito que quiere insertar: ");
                digito = sc.nextLong();
            }
            catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
                    
        } while (repetir||digito<0);
        
        copia = numeroIntroducido;

        // Calculamos la longitud del número

        do {
          copia /= 10;
          longitud++;
        } while (copia > 0);

        // parte izquierda con el dígito pegado
        parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
        parteIzquierda = parteIzquierda * 10 + digito;

        // parte derecha
        parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

        // resultado
        copia = parteIzquierda * (long)(Math.pow(10, longitud - posicion + 1)) + parteDerecha;
        System.out.print("El número resultante es " + copia);

        System.out.println("");
    }//main

}//class
