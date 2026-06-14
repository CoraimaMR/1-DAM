
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 8:26:08
 *
 *  Nombre del programa : practica24
 *
 *******************************************************/

/* Escribe un programa que muestre los limite primeros términos de la serie de Fibonacci. El
primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula
sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8,
13, 21, 34, 55, 89, 144… El número limite se debe introducir por teclado.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica24 {

    public static void main(String[] args) {

        // Declaración de variables
        int limite;
        int anterior=0, mostrar=1, suma;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.println("Introduce un valor:");
            limite = sc.nextInt();
        } while (limite<0);
        
        System.out.print("0, ");
        for (int i = 1; i < limite-1; i++) {
            System.out.print(mostrar+", ");
            suma=mostrar+anterior;
            anterior=mostrar;
            mostrar=suma;
        }
        System.out.print(mostrar+"...");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘