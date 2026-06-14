
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 5 dic 2025     ⏰ Hora: 8:23:45
 *
 *  Nombre del programa : Ejercicio07
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Un anagrama es una palabra que resulta del cambio del orden de los caracteres de
otra. Ejemplos de anagrama de la palabra roma son amor, ramo o mora. Construir 
un programa que solicite al usuario dos palabras e indique si son anagramas una 
de la otra.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        // Declaración de variables
        String palabra1, palabra2;
        boolean anagrama = true;
        char c;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la primera palabra: ");
        palabra1 = sc.nextLine().replace(" ", "");
        
        System.out.print("Introduce la segunda palabra: ");
        palabra2 = sc.nextLine().replace(" ", "");
        
        // Empezamos a crear el interior del programa
        if (palabra1.length() != palabra2.length()) {
            System.out.println("Al tener diferentes longitudes, no son anagramas.");
            anagrama  = false;
        } else {
            palabra1 = palabra1.toLowerCase();
            palabra2 = palabra2.toLowerCase();
            
            for (int i = 0; i < palabra1.length() && anagrama; i++) {
                c = palabra1.charAt(i);
                
                if (palabra2.indexOf(c) == -1) {
                    anagrama  = false;
                }
            }
            
            for (int i = 0; i < palabra2.length() && anagrama; i++) {
                c = palabra2.charAt(i);
                
                if (palabra1.indexOf(c) == -1) {
                    anagrama  = false;
                }
            }
        }
                
        // Mostramos el resultado
        if (anagrama) {
            System.out.println("Son anagramas.");
        } else {
            System.out.println("NO son anagramas.");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘