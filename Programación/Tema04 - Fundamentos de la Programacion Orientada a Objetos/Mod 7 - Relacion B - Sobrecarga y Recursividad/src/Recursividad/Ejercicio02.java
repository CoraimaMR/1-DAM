
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 29 ene 2026     ⏰ Hora: 13:26:40
 *
 *  Nombre del programa : Ejercicio02
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Diseñar una función que calcule a^n, donde a es real y n es entero no negativo. 
Realizar una versión iterativa y otra recursiva.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Recursividad;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        // Declaración de variables
        double a;
        int n;

        // Lectura de datos
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de a (real): ");
        a = sc.nextDouble();

        do {
            System.out.print("Introduce el valor de n (entero no negativo): ");
            n = sc.nextInt();
        } while (n < 0);

        // Cálculo y salida de resultados
        System.out.println("\nResultado versión ITERATIVA: " + potenciaIterativa(a, n));
        System.out.println("Resultado versión RECURSIVA: " + potenciaRecursiva(a, n));

        sc.close();
    } // main()

    // ───────────── FUNCIÓN ITERATIVA ─────────────
    public static double potenciaIterativa(double a, int n) {
        double resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= a;
        }

        return resultado;
    }

    // ───────────── FUNCIÓN RECURSIVA ─────────────
    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * potenciaRecursiva(a, n - 1);
        }
    }

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘
