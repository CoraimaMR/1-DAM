
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 11 dic 2025     ⏰ Hora: 11:52:52
 *
 *  Nombre del programa : Ejercicio03
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package tema03;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int tamaño, posicion, nuevo;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
                        
        try {
            System.out.print("Introduzca el tamaño del vector de enteros: ");
            tamaño = sc.nextInt();

            int[] elementos = new int[tamaño]; // Creación del vector

            System.out.println("Introduzca los elementos del vector...");

            for (int i = 0; i < elementos.length; i++) {
                System.out.print("Elemento "+i+": ");
                elementos[i] = sc.nextInt();
            }

            System.out.print("Introduzca la posición de inserción (0 - "+(tamaño-1)+"): ");
            posicion = sc.nextInt();
            
            System.out.print("Introduzca el elemento nuevo: ");
            nuevo = sc.nextInt();
            
            // Mostramos el resultado
            for (int i = 0; i < elementos.length; i++) {

                if (i == (tamaño-(tamaño-posicion))) {
                    System.out.print(nuevo+"     ");
                }
                System.out.print(elementos[i]+"     ");
            }
            System.out.println(); // Salto de linea
            
        } catch (Exception e) { // ERROR general
            System.out.println("OTRO TIPO DE ERROR: " + e);
        }              
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘