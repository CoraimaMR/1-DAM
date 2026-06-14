
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 17:50:48
 *
 *  Nombre del programa : practica04
 *
 *******************************************************/

/* 4. Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica04 {
    public static void main(String[] args) {

        // Declaración de variables
        int n;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
         n= sc.nextInt();
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘