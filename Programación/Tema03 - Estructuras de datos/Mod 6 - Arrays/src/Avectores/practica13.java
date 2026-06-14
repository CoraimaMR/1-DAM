
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 19 nov 2025     ⏰ Hora: 11:52:03
 *
 *  Nombre del programa : practica13
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que permita al usuario almacenar una secuencia aritmética en un 
array y luego mostrarla. Una secuencia aritmética es una serie de números que 
comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo,
con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia
sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de N (nº de 
valores a crear).
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica13 {

    public static void main(String[] args) {

        // Declaración de variables
        long[] vector;
        int v, l, tamaño;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del array:");
        tamaño = sc.nextInt();
        vector = new long[tamaño]; // Pongo el tamaño array
        
        System.out.print("Introduce un número de comienzo:");
        v = sc.nextInt();
        vector[0] = v; // Pongo el comienzo de la enumeración
        
        System.out.print("Introduce un número para sumar cada vez:");
        l = sc.nextInt();
        
        // Mostramos el resultado
        System.out.print(vector[0]+" "); // Mostramos el primero
        
        for (int i = 1; i < vector.length; i++) {  // Mostramos los demás
            vector[i] = vector[i-1] + l;
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘