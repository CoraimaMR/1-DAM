
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 4 nov 2025     ⏰ Hora: 
 *
 *  Nombre del programa : practica16
 *
 *******************************************************/

/* 16. Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica16 {

    public static void main(String[] args) {

        //Variables
        int n,i;
        boolean esPrimo=true;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.println("Introduce un valor entero positivo:");
            n = sc.nextInt();
        } while (n<=0);
        
        // Comprobamos si es primo
        if (n == 1) {
            esPrimo = false;
        } else {
            i = 2;
            // Comprobamos divisores desde 2 hasta n-1
            while (i < n && esPrimo) {
                if (n % i == 0) {
                    esPrimo = false;
                }
                i++;
            }
        }
        
        // DECIMOS SI N ES PRIMO O NO
        if (esPrimo) {
            System.out.println("ES PRIMO");  
        } else {
            System.out.println("NO ES PRIMO");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘