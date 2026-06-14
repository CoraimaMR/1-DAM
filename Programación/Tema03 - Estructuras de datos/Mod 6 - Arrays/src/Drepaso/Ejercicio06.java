
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 4 dic 2025     ⏰ Hora: 13:05:12
 *
 *  Nombre del programa : practica06
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribir un programa que pida el nombre completo al usuario y lo muestre sin 
vocales (mayúsculas, minúsculas y acentuadas). Por ejemplo, "Jesús Pérez" se 
mostrará "Jss Prz".
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        // Declaración de variables
        String nombre;
        String nombreSinVocales = "";
        String vocales = "AEIOUaeiou";

        // Lectura de datos
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre completo: ");
        nombre = sc.nextLine();

        // Recorremos el nombre carácter a carácter
        for (int i = 0; i < nombre.length(); i++) {
            // Comprobamos si NO hay vocales
            if (vocales.indexOf(nombre.charAt(i)) < 0) {

                nombreSinVocales += nombre.charAt(i);
            }
        }

        // Mostramos el resultado
        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘