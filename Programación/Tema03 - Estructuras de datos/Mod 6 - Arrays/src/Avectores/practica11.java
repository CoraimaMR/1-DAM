
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 18 nov 2025     ⏰ Hora: 9:57:07
 *
 *  Nombre del programa : practica11
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá 
en el primer array todos los valores del 1 al 100. Por último, deberá copiar 
todos los valores del primer array al segundo array en orden inverso, y mostrar 
ambos por pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;

public class practica11 {

    public static void main(String[] args) {

        // Declaración de variables
        int[] v1,v2;
        
        // Tamaño de los vectores
        v1 = new int[100];
        v2 = new int[100];
        
        // Empezamos a crear el interior del programa
        System.out.println("Array 1:");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = i+1;
        System.out.print(v1[i]+" ");
        }
        System.out.println("");

        // Mostramos el resultado
        System.out.println("Array 2:");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = v1[v1.length-i-1];
            System.out.print(v2[i]+" ");
        }
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘