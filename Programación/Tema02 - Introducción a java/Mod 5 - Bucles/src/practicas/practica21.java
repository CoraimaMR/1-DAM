
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 5 nov 2025     ⏰ Hora:
 *
 *  Nombre del programa : practica21
 *
 *******************************************************/

/* 21. Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
los números desde A hasta B e indicar cuantos hay que sean pares.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica21 {

    public static void main(String[] args) {

        //Variables
        int n1,n2,par=0;
        
        //Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        n1 = sc.nextInt();
        
        System.out.println("Introduce otro número mayor al anterior:");
        n2 = sc.nextInt();
        
        if (n1>=n2) {
            System.out.println("ERROR. El primer número tiene que ser menor que el segundo.");
        } else {
            for (int i = n1; i <= n2; i++) {
            System.out.print(i);
            System.out.print("");
            if (i%2==0) {
                par++;
            }
        }
            System.out.println("");
            System.out.println("Hay "+par);
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘