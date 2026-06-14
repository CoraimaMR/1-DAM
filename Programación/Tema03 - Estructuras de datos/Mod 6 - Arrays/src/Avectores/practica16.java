
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 19 nov 2025     ⏰ Hora: 13:25:42
 *
 *  Nombre del programa : practica16
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 
diez veces, y luego la muestre por pantalla. En esta ocasión has de utilizar 
Arrays.fill().
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;

import java.util.Arrays;

public class practica16 {

    public static void main(String[] args) {

        // Declaración de variables
        final int N=10; // Creamos una variable
        int[] vector;
        int tamaño, inicio = 0, fin = 0;
        
        // Calcular el tamaño del array
        tamaño = (N+1)*(N/2);
        vector = new int[tamaño]; // Ponemos el tamaño al array

        // Rellenar usando Arrays.fill()
        for (int i = 1; i <= N; i++) {
            fin = inicio + i; // siguiente tramo
            Arrays.fill(vector, inicio, fin, i);
            inicio = fin; // actualizar inicio para el siguiente número
        }
        
        // Mostramos el resultado
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘