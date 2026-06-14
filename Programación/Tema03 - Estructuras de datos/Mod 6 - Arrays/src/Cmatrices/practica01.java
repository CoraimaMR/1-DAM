
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 26 nov 2025     ⏰ Hora: 13:09:36
 *
 *  Nombre del programa : practica01
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 
1 al 25 y luego muestre la matriz por pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Cmatrices;

public class practica01 {

    public static void main(String[] args) {

        // Declaración de la matriz
        int matriz[][]=new int[5][5];  // Tamaño de la maatriz F/C
        int contador = 0;
        
        // Empezamos a crear el interior del programa
        //La rellenamos con valores del 1 al 25
        for (int i = 0; i < matriz.length; i++) {  // FILA
            for (int j = 0; j < matriz[0].length; j++) {  // COLUMNA
                matriz[i][j]= contador;
                contador++;
            }
        }
        
        //Mostramos sus valores por pantalla
        for (int i = 0; i < matriz.length; i++) {  // FILA
            for (int j = 0; j < matriz[0].length; j++) {  // COLUMNA
                System.out.print(matriz[i][j]+"\t");               
            }
            System.out.println("");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘