
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 5 dic 2025     ⏰ Hora: 8:56:56
 *
 *  Nombre del programa : Ejercicio08
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que rellene un array de 20 elementos con números enteros 
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el 
programa mostrará el array y preguntará si el usuario quiere resaltar los 
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array 
escribiendo los números que se quieren resaltar entre corchetes.

Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13

¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7):1
159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 
326 223 13
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        final int TAMAÑO = 20;
        int seleccion, divisor = 0;
        
        // Creamos el array
        int[] vector = new int[TAMAÑO];  // Tamaño del array
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*401);
            System.out.print(vector[i]+" ");
        }
        System.out.println();  // Salto de linea
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Qué números quiere resaltar?\n1. Los múltiplos de 5"
                + "\n2. Los múltiplos de 7\n");
        seleccion = sc.nextInt();
        
        // Según su selección
        switch (seleccion) {
            case 1:  // MULTIPLOS DE 5
                divisor = 5;
                break;
            case 2:  // MULTIPLOS DE 7
                divisor = 7;
                break;
            default:
                System.out.println("ERROR. Debe introducir el número 1 o 2.");
        }
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%divisor == 0) {
                System.out.print("["+vector[i]+"] ");
            }else{
                System.out.print(vector[i]+" ");
            }
        }
        System.out.println();  // Salto de linea
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘