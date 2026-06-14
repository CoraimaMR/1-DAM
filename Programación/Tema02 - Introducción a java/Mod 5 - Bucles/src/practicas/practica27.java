
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 8:59:44
 *
 *  Nombre del programa : practica27
 *
 *******************************************************/

/* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa
pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera
entre 2) de la altura más uno.
Ejemplo:
Introduzca la altura de la L: 5
*
*
*
*
* * *
  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica27 {

    public static void main(String[] args) {

        // Declaración de variables
        double altura, horizontal;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {     
            System.out.println("Introduce la altura:");
             altura= sc.nextDouble();
        } while (altura<1);
        
        // Empezamos a crear el interior del programa
        //ALTURA
        for (int i = 1; i <= altura-1; i++) {
            System.out.println("*");
        }
        //HORIZONTAL
        horizontal=altura/2;
        for (int i = 1; i <= horizontal+1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘