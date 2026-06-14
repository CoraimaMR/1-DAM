
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 29 ene 2026     ⏰ Hora: 13:26:49
 *
 *  Nombre del programa : Ejercicio03
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Diseñar una función recursiva que calcule el enésimo término de la serie de 
Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores 
anteriores de la serie. Es decir:
fibonacci(n) = fibonacci(n-1)+fibonacci(n-2)
fibonacci(0) = 1
fibonacci(1) = 1
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Recursividad;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        // Declaración de variables
        int n;

        // Lectura y comprobación de datos
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce el valor de n (entero no negativo): ");
            n = sc.nextInt();
        } while (n < 0);

        // Mostramos el resultado
        System.out.println("El término " + n + " de la serie de Fibonacci es: " + fibonacci(n));

        sc.close();
    } // main()

    // ───────────── FUNCIÓN RECURSIVA ─────────────
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘
