
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 17 nov 2025     ⏰ Hora: 21:54:26
 *
 *  Nombre del programa : practica07
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida dos valores enteros P y Q, luego cree un array que 
contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica07 {
    public static void main(String[] args) {

        // Declaración de variables
        int[] v1;
        int p, q;
        
         // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número:");
         p = sc.nextInt();
        
         System.out.print("Introduce el último número:");
         q = sc.nextInt();
         
        // Empezamos a crear el interior del programa
        v1 = new int[q - p +1];  // Tamaño Q
        
        for (int i = 0; i < v1.length; i++) {
            v1[i] = p + i; // Ponemos un valor a cada vector
            System.out.print(v1[i]+" ");  // Mostramos resultado
        }
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘