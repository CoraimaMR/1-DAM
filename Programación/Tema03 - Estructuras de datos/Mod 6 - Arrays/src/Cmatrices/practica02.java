
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 26 nov 2025     ⏰ Hora: 13:10:15
 *
 *  Nombre del programa : practica02
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree una matriz de 10x10 e introduzca los valores de las 
tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la 
matriz por pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Cmatrices;

public class practica02 {

    public static void main(String[] args) {

        // Declaración de la matriz
        int matriz[][]=new int[10][10];  // Tamaño de la maatriz F/C
        
        // Empezamos a crear el interior del programa
        //La rellenamos con valores de las tablas del 1 al 10
        for (int i = 0; i < matriz.length; i++) {  // FILA
            System.out.println("TABLA DEL "+(i+1));
            for (int j = 0; j < matriz[0].length; j++) {  // COLUMNA
                matriz[i][j]= (i+1)*(j+1);
                System.out.print(matriz[i][j]+"\t");  // Lo mostramos
            }
            System.out.println("");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘