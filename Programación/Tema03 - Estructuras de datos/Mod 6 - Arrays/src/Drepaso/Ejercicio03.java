
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 3 dic 2025     ⏰ Hora: 12:32:24
 *
 *  Nombre del programa : Ejercicio03
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas 
relleno con números aleatorios entre 500 y 900. A continuación, el programa debe
mostrar los números de la diagonal que va desde la esquina inferior izquierda a 
la esquina superior derecha, así como el máximo, el mínimo y la media de los 
números que hay en esa diagonal.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;

public class Ejercicio03 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        final int FILAS = 9, COLUMNAS = 9;
        int max = 500, min = 900, suma = 0;
        int contador = 0;
        
        // Creación de la matriz y vectores
        int matriz[][] = new int[FILAS][COLUMNAS];  // Matriz de tamaño F/C
        
        int[] diagonal = new int[FILAS]; // Vector de tamaño FILAS
        
        // Empezamos a crear el interior del programa
        System.out.println("----------------- MATRIZ -----------------");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = (int) ((Math.random()*401)+500);
                System.out.print(matriz[i][j]+"  ");
                
                if (j == (COLUMNAS-1-i)) {
                    diagonal[contador] = matriz[i][j];
                    if (matriz[i][j] > max) max = matriz[i][j];
                    if (matriz[i][j] < min) min = matriz[i][j];
                    suma += matriz[i][j];
                    contador++;
                }
            }
            System.out.println();  // Siguiente linea
        }
        System.out.println();  // Siguiente linea
        
        // Mostramos el resultado
        System.out.println("---------- Diagonal de la matriz ----------");
        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i]+" ");
        }
        System.out.println();  // Siguiente linea
        System.out.println("Número máximo obtenido en la diagonal: "+max);
        System.out.println("Número mínimo obtenido en la diagonal: "+min);
        System.out.println("Media obtenida en la diagonal: "+suma/contador);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘