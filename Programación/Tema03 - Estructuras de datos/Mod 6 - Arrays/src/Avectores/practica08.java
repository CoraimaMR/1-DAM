
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 18 nov 2025     ⏰ Hora: 9:05:03
 *
 *  Nombre del programa : practica08
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 
1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por 
último, mostrará cuántos valores del array son igual o superiores a R.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica08 {

    public static void main(String[] args) {

        // Declaración de variables
        double[] v;
        double r = 0;
        boolean fallo;
        int contador = 0;
        
        // Creamos 100 números aleatorios
        v = new double[100];
        
        for (int i = 0; i < v.length; i++) {
            v[i] = Math.random()*1;
        }
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número (0-1): ");
        r = sc.nextDouble();
        
        // Mostramos el resultado
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= r) contador++;
        }
        System.out.println("Contador: "+contador);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘