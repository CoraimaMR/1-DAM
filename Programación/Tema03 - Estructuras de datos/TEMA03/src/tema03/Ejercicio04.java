
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 11 dic 2025     ⏰ Hora: 11:53:01
 *
 *  Nombre del programa : Ejercicio04
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package tema03;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        final int COLUMNAS = 4, FILAS = 4;
        int sumaFilas = 0, sumaTotalFilas = 0, sumaTotalColumnas = 0;
        
        // Creación de arrays
        int matriz[][] = new int[FILAS][COLUMNAS];  // Matriz de tamaño F/C
        
        int[] columnas = new int[COLUMNAS]; // Vector de tamaño columnas
        int[] filas = new int[FILAS]; // Vector de tamaño filas
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los datos de la matriz: ");
         
        for (int i = 0; i < FILAS; i++) {
             System.out.println("FILA "+(i+1)+".");
             for (int j = 0; j < COLUMNAS; j++) {
                 System.out.print("Columna "+(j+1)+": ");
                 matriz[i][j] = sc.nextInt();  // Preguntamos el dato i j
                 
                 // Calculos dentro de la matriz
                 sumaFilas += matriz[i][j];  // Sumo toda la fila
                 columnas[j] += matriz[i][j];  // Sumo1 toda la columna
             }
             filas[i] = sumaFilas;  // Guardamos el dato de las fila i
             sumaFilas = 0;  // REstablezco el valor
        }
        System.out.println();  // Salto de linea
        
        // Mostramos la matriz
        System.out.println("-MATRIZ-----C1--C2--C3--C4----SumFilas--");
        for (int i = 0; i < FILAS; i++) {
             System.out.print("Fila "+(i+1)+" -->  ");
             for (int j = 0; j < COLUMNAS; j++) {
                 System.out.print(matriz[i][j]+"   ");
             }
             // Mostramos las sumas de las filas
             System.out.printf(" |\t %d\n",filas[i]);
        }
        // Mostramos las sumas de las columnas
        System.out.print("SumColumnas: ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.printf("%d   ", columnas[i]);
            
            // SUMAMOS LOS VECTORES
            sumaTotalColumnas += columnas[i];  // Sumo todas las columnas
            sumaTotalFilas += filas[i];  // Sumo la fila con las otras filas
        }
        System.out.println();  // Salto de linea
        
        // Muestramos los resultados
        System.out.println("\nSuma total Filas: "+sumaTotalFilas);
        System.out.println("Suma total Columnas: "+sumaTotalColumnas);
        System.out.println();  // Salto de linea
        
        if (sumaTotalFilas == sumaTotalColumnas) {
            System.out.println("Es un cuadro mágico.");
        } else {
            System.out.println("No es un cuadro mágico.");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘