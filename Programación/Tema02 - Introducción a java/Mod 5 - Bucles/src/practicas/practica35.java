
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 11 nov 2025     ⏰ Hora: 9:28:45
 *
 *  Nombre del programa : practica35
 *
 *******************************************************/

/* Ejercicio 35 
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay 
dentro de un número.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica35 {

    public static void main(String[] args) {

        // Declaración de variables
        double n, copia;
        int longitud = 0, digito = 0;
        int par = 0, impar = 0;
        boolean repetir; 
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número positivo: ");
        n = sc.nextLong();
        
        // Empezamos a crear el interior del programa
        copia=n;
        
        // Contar dígitos y pares/impares
        while (copia > 0) {
            digito = (int)(copia % 10);
            if (digito % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            copia /= 10;
        }
        
        // Mostramos resultado
        System.out.println("En el número "+n+" hay "+par+" números pares y "+impar+" números impares.");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘