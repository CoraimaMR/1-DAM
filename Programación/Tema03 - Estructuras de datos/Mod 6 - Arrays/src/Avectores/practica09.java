
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 18 nov 2025     ⏰ Hora: 9:20:50
 *
 *  Nombre del programa : practica09
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con 
valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego 
pedirá un valor N y mostrará en qué posiciones del array aparece N.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica09 {

    public static void main(String[] args) {

        // Declaración de variables
        int[] v;
        int n;
        
        // Valores para el vector
        v = new int[100]; //tamaño vector
        
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random()*10)+1;
        }
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número a buscar (1-10):");
        n = sc.nextInt();
        
        // Mostramos el resultado
        System.out.println("Posición del array donde aparece N: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘