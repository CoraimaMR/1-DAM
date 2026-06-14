
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 5 dic 2025     ⏰ Hora: 9:12:34
 *
 *  Nombre del programa : Ejercicio09
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que calcule la estatura media, mínima y máxima en centímetros
de personas de diferentes países. El vector que contiene los nombres de los 
países es el siguiente: país = {“España”, “Rusia”, “Japón”, “USA”}. Los datos 
sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas 
con números aleatorios generados al azar entre 140 y 210. Los decimales de la 
media se pueden despreciar. Los nombres de los países se deben mostrar utilizando
el array de países (no se pueden escribir directamente).
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;

public class Ejercicio09 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        final int FILAS = 4, COLUMNAS = 10;
        
        // Creación array
        int estaturas[][] = new int[FILAS][COLUMNAS];  // Matriz de tamaño F/C
        int estadisticas[][] = new int[FILAS][3];  // Matriz de tamaño F/C
        
        String[] pais = {"España", "Rusia", "Japón", "USA"};
        
        // Empezamos a crear el interior del programa
        System.out.println("- PAIS -  0    1    2    3    4    5    6    7    8    9   |"
                + " MAX - MIN - MED");
        for (int i = 0; i < FILAS; i++) {
            System.out.printf("%s:\t", pais[i]);
            for (int j = 0; j < COLUMNAS; j++) {
                estaturas[i][j] = (int) (Math.random()*70)+140;
                System.out.printf(" %d ", estaturas[i][j]);
                
                if (j == 0) {
                    estadisticas[i][0] = estaturas[i][j]; //MAX
                    estadisticas[i][1] = estaturas[i][j]; //MIN
                    estadisticas[i][2] = estaturas[i][j]; //MED
                    
                } else {
                    if (estaturas[i][j] > estadisticas[i][0]) estadisticas[i][0] = estaturas[i][j]; //MAX
                    if (estaturas[i][j] < estadisticas[i][1]) estadisticas[i][1] = estaturas[i][j]; //MIN
                    estadisticas[i][2] += estaturas[i][j]; //MED
                }
            }
            System.out.print(" | ");
            
            // Mostramos los resultados de las med,max,min
            System.out.printf(" %d  %d  %d \n",estadisticas[i][0],estadisticas[i][1],(estadisticas[i][2]/COLUMNAS));
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘