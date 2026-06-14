
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 3 dic 2025     ⏰ Hora: 13:16:35
 *
 *  Nombre del programa : Ejercicio04
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un algoritmo que pida 5 palabras por teclado y que al final nos muestre la 
de mayor y menor longitud. Si coinciden dos o más palabras con la mayor o menor 
longitud, entonces se mostrará la primera que se introdujo.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Declaración de variables
        String palabra;
        String mayor = "";
        String menor = "";

        // Lectura de las 5 palabras
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la palabra " + i + ": ");
            palabra = sc.nextLine();

            // Primera palabra: se inicializan mayor y menor
            if (i == 1) {
                mayor = palabra;
                menor = palabra;
            } else {
                // Comprobamos mayor longitud
                if (palabra.length() > mayor.length()) {
                    mayor = palabra;
                }
                // Comprobamos menor longitud
                if (palabra.length() < menor.length()) {
                    menor = palabra;
                }
            }
        }

        // Mostramos el resultado final
        System.out.println("\nLa palabra de MAYOR longitud es: " + mayor);
        System.out.println("La palabra de MENOR longitud es: " + menor);

    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘