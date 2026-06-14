
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 19 nov 2025     ⏰ Hora: 12:12:41
 *
 *  Nombre del programa : practica14
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
 Crea un programa que cree un array de enteros e introduzca la siguiente 
secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta 
introducir 10 diez veces, y luego la muestre por pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;

public class practica14diezVces10 {

    public static void main(String[] args) {

        // Declaración de variables
        final int N=10; // Creamos una variable
        int[] vector;
        int tamaño = 0, i, valor = 1, contador = 0;
        
        // Calcular el tamaño del array
        
        // OPCIÓN 1: Bucle
//        for (int n = 1; n <= 10; n++) {
//            tamaño += n;
//        }    
        
        // OPCIÓN 2: Fórmula
        tamaño = (N+1)*(N/2);
        
        vector = new int[tamaño]; // Ponemos el tamaño al array
        
        // Mostramos el resultado
        
        // OPCIÓN 1: MAL --> 2 bucles
//        for ( i = 1; i <= 10; i++) {
//            for (int j = 0; j < i; j++) {
//                vector[j] = i;
//                System.out.print(vector[j]+" ");
//            }
//        }
//        System.out.println("");

        // OPCIÓN 2: BIEN --> 1 bucle
        for (int j = 0; j < tamaño; j++) {
            vector[j] = valor;
            System.out.print(vector[j]+" ");
            contador++;
            if (contador == valor) {
                valor++;
                contador = 0;
            }
        }
        System.out.println("");
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘