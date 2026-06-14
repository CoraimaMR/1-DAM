
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 4 nov 2025     ⏰ Hora:
 *
 *  Nombre del programa : practica17
 *
 *******************************************************/

/* 17. Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último
dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica17 {

    public static void main(String[] args) {

        //Variables
        int n1,n2;
        int i=0, fallo=0;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un valor de inicio:");
        n1 = sc.nextInt();
        
        do {     
            i++;
            System.out.println("Introduce un valor:");
            n2 = sc.nextInt();
            if (n2>n1) {
                System.out.println("Número aceptado. Es mayor que el número anterior.");
                n1=n2;
            } else {
                fallo++;
            }
        } while (n2!=0);
        
        System.out.println("Total de números introducidos, excluido el 0: "+i);
        System.out.println("Total de números fallados: "+fallo);
        
        // OTRA SOLUCIÓN Integer.MIN_VALUE
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘