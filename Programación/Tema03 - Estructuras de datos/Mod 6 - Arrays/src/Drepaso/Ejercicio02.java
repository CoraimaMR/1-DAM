
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 3 dic 2025     ⏰ Hora: 12:00:02
 *
 *  Nombre del programa : Ejercicio02
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que contenga un vector de tamaño N definido por una constante. 
A continuación, lee N números por teclado y almacénalos en dicho vector. Luego, 
desplaza los elementos de manera que el de la posición 0 pase a la posición 1, 
el de la posición 1 a la 2, etc. El número que se encuentra en la posición final 
debe pasar a la número 0. Muestra por pantalla el resultado inicial y el final. 
Utiliza un solo vector para todo el proceso.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        // Declaración de constantes
        final int N = 5;

        // Creación del vector
        int[] vector = new int[N];

        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.print("Introduce un número (posición " + i + "): ");
            vector[i] = sc.nextInt();
        }

        // Mostramos el vector inicial
        System.out.println("\n-------- Vector inicial --------");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }

        // Desplazamiento circular a la derecha
        int ultimo = vector[N - 1]; // Guardamos el último elemento
        for (int i = N - 1; i > 0; i--) {
            vector[i] = vector[i - 1]; // Movemos cada elemento a la derecha
        }
        vector[0] = ultimo; // El último pasa a la primera posición

        // Mostramos el vector final
        System.out.println("\n--------- Vector final ---------");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘