
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 19:24:42
 *
 *  Nombre del programa : practica28
 *
 *******************************************************/

/* Ejercicio 28
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa
pedirá la altura. El programa inserta un espacio y pinta dos asteriscos menos en la base
para simular la curvatura de las esquinas inferiores.
Ejemplo 1:
Introduzca la altura de la U: 5
*     *
*     *
*     *
*     *
 * * *   */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica28 {
    public static void main(String[] args) {

        // Declaración de variables
        int altura, separacion, linea=0;
        
        //Comprobacción de datos introducidos
        do {          
            // Lectura de datos por teclado
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la altura:");
             altura= sc.nextInt();
        } while (altura<1);
        
        // Empezamos a crear el interior del programa
        
            //CASO NO 1
            if (altura==1 ) {
            System.out.print("*");
            }else{
                //CASO 2
                if (altura==2) {
                    separacion=1;
                //OTROS CASOS
                } else {
                    separacion=altura-2;
                }
                
                //PRINT
                 do {
                     linea++; 
                     
                    //PRIMER ASTERISCO
                    System.out.print("*");
                    
                    //ESPACIOS BLANCOS 
                    for (int i = 1; i <= separacion; i++) {
                    System.out.print(" ");
                     }
                    
                    //ULTIMO ASTERISCO
                     System.out.println("*");
                     
                  } while (linea<altura-1);
                 
                //ULTIMA LINEA
                System.out.print(" ");
                for (int i = 1; i <= separacion; i++) {
                    System.out.print("*");
                }
        }
            System.out.println(" ");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘