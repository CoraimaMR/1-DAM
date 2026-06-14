
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 4 nov 2025     ⏰ Hora:
 *
 *  Nombre del programa : practica19
 *
 *******************************************************/

/* 19. Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces
igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
escribir un único asterisco.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica19 {

    public static void main(String[] args) {

        //Variables
        int n;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un valor positivo:");
        n = sc.nextInt();
        
        //PRIMERA FORMA
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        
        // SEGUNDA FORMA
//        
//        if (n==0) {
//            System.out.println("Ha introducido un 0");
//        } else {
//            for (int i = 0; i < n; i++) {
//                System.out.println("*");
//            }
//            System.out.println("");
//        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘