
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 19 nov 2025     ⏰ Hora: 13:38:43
 *
 *  Nombre del programa : practica17
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 
primeros en un array y los 10 últimos en otro array. Por último, comparará ambos
arrays y le dirá al usuario si son iguales o no.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Arrays;
import java.util.Scanner;

public class practica17ArraysEquals {

    public static void main(String[] args) {

        // Declaración de variables
        int[] v1, v2;
        int n;
        boolean iguales = true;
        
        v1 = new int[10];
        v2 = new int[10];
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        // Un solo bucle para leer los 20 valores
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce un número (" + (i+1) + "/20): ");
            n = sc.nextInt();

            if (i < 10) {         // Los primeros 10 valores → v1
                v1[i] = n;
            } else {             // Los siguientes 10 valores → v2
                v2[i - 10] = n;
            }
        }
        // Mostramos el resultado
        if (Arrays.equals(v1, v2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO son iguales");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘