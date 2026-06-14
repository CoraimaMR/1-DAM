
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 4 nov 2025     ⏰ Hora:
 *
 *  Nombre del programa : practica15 
 *
 *******************************************************/

/* 15. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica15 {

    public static void main(String[] args) {

        //Variables
        int n,multiplo=0;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el valor del limite:");
        n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            if (i%3==0) {
                 multiplo++;
            }
        }
        
        System.out.println("Hay "+multiplo+" múltiplos de 3 hasta el "+n);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘