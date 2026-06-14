
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 17 nov 2025     ⏰ Hora: 21:46:08
 *
 *  Nombre del programa : practica06
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida dos valores enteros N y M, luego cree un array de 
tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica06 {
    public static void main(String[] args) {

        // Declaración de variables
        int n, m;
        int[] v1;
        
         // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del array:");
         n = sc.nextInt();
         
         System.out.print("Introduce el número a mostrar:");
         m = sc.nextInt();
        
        // Empezamos a crear el interior del programa
        v1 = new int[n];  // Vector tamaño n
        
        // Mostramos M en todas sus posiciones
        for (int i = 0; i < v1.length; i++) {
            v1[i] = m;
            System.out.print(v1[i]+" ");
        }
        System.out.println("");
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘