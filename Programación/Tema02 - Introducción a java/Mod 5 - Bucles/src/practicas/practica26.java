
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 8:51:09
 *
 *  Nombre del programa : practica26
 *
 *******************************************************/

/* Realiza un programa que pida un número por teclado y que luego muestre ese número al
revés.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica26 {

    public static void main(String[] args) {

        // Declaración de variables
        int n, numeroInvertido=0;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        n = sc.nextInt();
        
        // Empezamos a crear el interior del programa
        int numeroOriginal = n;

        while (n != 0) {
            int digito = n % 10; // Extraer el último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Añade al número invertido
            n /= 10; // Eliminar el último dígito del número original
        }

        System.out.println("El número " + numeroOriginal + " al revés es: " + numeroInvertido);

    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘