
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 26 nov 2025     ⏰ Hora: 13:10:48
 *
 *  Nombre del programa : practica03
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por 
teclado) e introduzca en ella NxM valores (también introducidos por teclado). 
Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores 
son mayores que cero, cuántos son menores que cero y cuántos son igual a cero.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Cmatrices;
import java.util.Scanner;

public class practica03 {

    public static void main(String[] args) {

        // Declaración de variables
        int fila, columna;
        int igual = 0, menor = 0, mayor = 0;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce las filas totales:");
        fila = sc.nextInt();
        
        System.out.print("Introduce las columnas totales:");
        columna = sc.nextInt();
        
        int matriz[][]=new int[fila][columna];  // Tamaño de la maatriz F/C
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Introduce el valor para ("+i+", "+j+"):");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j]==0) {
                    igual++;
                } else {
                    if (matriz[i][j]>0) {
                       mayor++; 
                    } else {
                        menor++;
                    }
                }
            }
        }
        
        // Mostramos los resultados
        System.out.println("----------------------------------------");
        System.out.println("Números de valores mayores que 0: "+mayor);
        System.out.println("Números de valores menores que 0: "+menor);
        System.out.println("Números de valores iguales que 0: "+igual);
        System.out.println("----------------------------------------");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘