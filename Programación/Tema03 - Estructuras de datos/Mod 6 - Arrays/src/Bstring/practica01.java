
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 27 nov 2025     ⏰ Hora: 13:37:57
 *
 *  Nombre del programa : practica01
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida una cadena de texto por teclado y luego muestre cada 
palabra de la cadena en una línea distinta.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Bstring;
import java.util.Scanner;

public class practica01 {

    public static void main(String[] args) {
        
        // Declaración de variables
        String texto;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        texto = sc.nextLine();
        
        // Empezamos a crear el interior del programa
        // Dividir la cadena en palabras
        String[] palabras = texto.split(" ");

        // Mostramos resultados
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘