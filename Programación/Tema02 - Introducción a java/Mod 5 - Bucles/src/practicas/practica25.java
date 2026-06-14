
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 8:42:29
 *
 *  Nombre del programa : practica25
 *
 *******************************************************/

/* Escribe un programa que lea un número n e imprima una pirámide de números con n filas
como en la siguiente figura:
   1
  121
 12321
1234321  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica25 {

    public static void main(String[] args) {

        // Declaración de variables
        int n, blanco, digito;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.println("Introduce un valor:");
            n = sc.nextInt();
        } while (n<0);
        
        // Empezamos a crear el interior del programa
                        //PIRAMIDE
        blanco=n-1;
        
        //Lineas
        for (int i = 1; i <= n; i++) {
            //Blanco
            for (int j = 1; j <= blanco; j++) {
                System.out.print(" ");
            }
            //Primeros  digitos
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }
            //Segundo digito
            for (int m = i; m >= 1; m--) {
                System.out.print(m);
            }
            blanco--;
            System.out.println("");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘