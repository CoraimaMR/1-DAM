/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej38;
import java.util.InputMismatchException;
import java.util.Scanner;

/*------------------------------- ENUNCIADO ------------------------------------
Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no.
*/

/**
 * @author Jesús Pérez 
 */
public class Ej38 {

    public static void main(String[] args) {
        long numeroIntroducido=0, copia;
        int digito=0, buenaSuerte=0, malaSuerte=0;
        long parteIzquierda, parteDerecha;
        
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
        
        //Comprobamos dígito a dígito y los contamos según sea su valor
        copia=numeroIntroducido;
        while (copia>0) {
            digito=(int)copia%10;
            copia/=10;
            
            if (digito==3||digito==7||digito==8||digito==9) {
                buenaSuerte++;
            } else {
                malaSuerte++;
            }
            
        }//while
        
        if (buenaSuerte>malaSuerte) {
            System.out.println("Número AFORTUNADO");
        } else {
            System.out.println("Número NO afortunado");
        }
    }//main

}//class
