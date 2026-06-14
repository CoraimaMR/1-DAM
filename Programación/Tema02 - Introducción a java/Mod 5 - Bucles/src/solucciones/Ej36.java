/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
********************************** ENUNCIADO *********************************
Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir 
la altura. Se debe comprobar que la altura sea un número impar mayor o igual 
a 3, en caso contrario se debe mostrar un mensaje de error.
******************************************************************************
*/

package ej36;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class Ej36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura, alturaIntroducida, espaciosInternos;
        int espaciosPorDelante;
        int i;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la X: ");
        alturaIntroducida = sc.nextInt();

        altura = 1;
        i = 0;
        espaciosInternos = alturaIntroducida - 1;
        espaciosPorDelante = 0;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3.");
    } else {
      // parte de arriba /////////////////////////////////////
      while (altura < alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;      
      } // while parte de arriba ///////////////////////
      
      // parte de abajo /////////////////////////////////////
      espaciosInternos = 0;
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        
        if(altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      } // while parte de abajo ///////////////////////
    } // else
    }
    
}
