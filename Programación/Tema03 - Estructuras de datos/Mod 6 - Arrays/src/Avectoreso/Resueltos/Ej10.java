package Avectoreso.Resueltos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
+++++++++++++++++++++++++++++++++ ENUNCIADO ++++++++++++++++++++++++++++++++++
10. Crea un programa para realizar cálculos relacionados con la altura 
(en metros) de personas. Pedirá un valor N y luego almacenará en un array 
N alturas introducidas por teclado. Luego mostrará la altura media, máxima 
y mínima así como cuántas personas miden por encima y por debajo de la media.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Jesús Pérez
 */
public class Ej10 {
    public static void main(String[] args) {
        int n, encimaMedia=0, debajoMedia=0;
        double max, min, media, suma;
        
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Diga el número de alturas que quiere introducir: ");
        n=sc.nextInt();
        
        //Declaro el array con el tamaño introducido por el usuario
        double alturas[]=new double[n];
        
        suma=0;
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduzca la altura de la persona "+i);
            alturas[i]=sc.nextDouble();
            suma+=alturas[i]; 
        }//for
        
        //Calculo max, min y media
        max=alturas[0];
        min=alturas[0];
        media=suma/alturas.length;
                
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i]>max) {
                max=alturas[i];
            }
            if (alturas[i]<min) {
                min=alturas[i];
            }
            if (alturas[i]>media) {
                encimaMedia++;
            }else{
                if (alturas[i]<media) {
                    debajoMedia++;
                }
            }
        }//for
        
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("media = " + (suma/alturas.length));
        System.out.println("Hay "+encimaMedia+" personas por encima de la media");
        System.out.println("Hay "+debajoMedia+" personas por debajo de la media");
    }//main
}
