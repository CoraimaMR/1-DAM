
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 19 nov 2025     ⏰ Hora: 13:07:34
 *
 *  Nombre del programa : practica15
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida la usuario dos valores N y M y luego cree un array de 
tamaño N que contenga M en todas sus posiciones. Luego muestra el array por 
pantalla.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Arrays;
import java.util.Scanner;

public class practica15Arraysfill {

    public static void main(String[] args) {

        // Declaración de variables
        int[] vector;
        int n, m;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del array:");
        n = sc.nextInt();
        vector = new int[n]; // Ponemos el tamaño al array
        
        System.out.print("Introduce el número que tendra el array en todas sus "
                + "posiciones:");
        m = sc.nextInt();

        // Mostramos el resultado
        
        // OPCIÓN 1: NO
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = m;
//            System.out.print(vector[i]+" ");
//        }
//        System.out.println("");

        // OPCIÓN 2: SI --> Array .fill
        Arrays.fill(vector, m);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘