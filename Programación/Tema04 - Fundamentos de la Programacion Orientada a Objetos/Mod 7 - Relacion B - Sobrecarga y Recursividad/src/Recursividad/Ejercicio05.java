
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 29 ene 2026     ⏰ Hora: 13:28:28
 *
 *  Nombre del programa : Ejercicio05
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Diseña un algoritmo recursivo que decida si una palabra es o no un palíndromo.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Recursividad;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        // Declaración de variables
        String palabra;

        // Lectura de datos
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();

        // Mostramos el resultado
        if (esPalindromo(palabra)) {
            System.out.println("La palabra ES un palíndromo.");
        } else {
            System.out.println("La palabra NO es un palíndromo.");
        }

        sc.close();
    } // main()

    // ───────────── FUNCIÓN RECURSIVA ─────────────
    public static boolean esPalindromo(String palabra) {

        // Caso base: 0 o 1 letra
        if (palabra.length() <= 1) {
            return true;
        }

        // Si la primera y la última letra no coinciden
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }

        // Llamada recursiva quitando la primera y última letra
        return esPalindromo(palabra.substring(1, palabra.length() - 1));
    }

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘
