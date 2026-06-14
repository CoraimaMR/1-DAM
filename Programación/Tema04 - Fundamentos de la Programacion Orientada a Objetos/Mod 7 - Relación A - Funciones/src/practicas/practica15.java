
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 13 ene 2026     ⏰ Hora: 10:21:06
 *
 *  Nombre del programa : practica15
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que cree un array de tamaño 100 con los primeros 100 números
naturales. Luego muestra la suma total y la media. Implementa una función que 
calcule la suma de un array y otra que calcule la media de un array
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

/*******************************************************************************
* DESCRIPCIÓN
*
* @author 🌟 Coraima Mera Rodríguez 🌟
* @since 🗓️ Fecha: 13 ene 2026 ⏰ Hora: 10:21:06
* @version 1.0
*******************************************************************************/

public class practica15 {

    public static void main(String[] args) {
        
        // Declaración de variables y constantes
        int sumaTotal = 0;

        // Creación de array 1 dimensión
        final int TAMAÑO = 100; 
        int[] vector = new int[TAMAÑO]; // Vector de tamaño 100
        
        for (int i = 1; i < 100; i++) {
            vector[i-1] = i;
        }
        
         // Empezamos a crear el interior del programa
         sumaTotal = sumaArray (vector, sumaTotal);
        
        // Mostramos el resultado
        System.out.println("Suma total del array: " + sumaArray(vector, sumaTotal));
        System.out.println("Media del array: " + mediaArray (sumaTotal, TAMAÑO));

    } //main()
    
    public static int sumaArray (int[] vector, int sumaTotal){
        
        // Empezamos a crear el interior del programa
        for (int i = 0; i < vector.length; i++) {
            sumaTotal += vector[i];
        }
        
        // Devuelvo el resultado
        return sumaTotal;        
        
    } // sumaArray (vector, sumaTotal)
    
    public static int mediaArray (int sumaTotal, int TAMAÑO){
        
        // Devuelvo el resultado
        return sumaTotal/TAMAÑO;        
        
    } // mediaArray (sumaArray, TAMAÑO)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘