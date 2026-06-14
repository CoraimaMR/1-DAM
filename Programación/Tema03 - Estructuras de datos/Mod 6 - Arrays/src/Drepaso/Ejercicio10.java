
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 9 dic 2025     ⏰ Hora: 9:50:15
 *
 *  Nombre del programa : Ejercicio10
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que genere n números enteros aleatorios entre 0 y 100 (donde
n es un número solitado por teclado) y que los almacene en un vector. El programa
debe ser capaz de pasar todos los números pares a las primeras posiciones del 
array (del 0 en adelante) y todos los números impares a las celdas restantes.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Declaración de variables
        int n;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Tamaño del array: ");
        n = sc.nextInt();
        
        // Creacion de array
        int[] numeros = new int[n]; // Vector de tamaño n
        
        // Empezamos a crear el interior del programa
        System.out.println("Array sin ordenadar:");
        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random()*101);
            System.out.printf("%d ", numeros[i]);
        }
        System.out.println();  // Salto de linea

        // Mostramos el resultado
        System.out.println("Array ordenado: ");
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ", numeros[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.printf("%d ", numeros[i]);
            }
        }
        System.out.println();  // Salto de linea
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘