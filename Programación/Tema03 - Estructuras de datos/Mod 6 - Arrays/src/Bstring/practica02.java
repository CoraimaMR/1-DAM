
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 1 dic 2025     ⏰ Hora: 18:37:08
 *
 *  Nombre del programa : practica02
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que pida dos cadenas de texto por teclado y luego indique si 
son iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Bstring;
import java.util.Scanner;

public class practica02 {

    public static void main(String[] args) {

        // Declaración de variables
        String texto1;
        String texto2;
        boolean iguales;
        boolean igualesSinMayus;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la primera cadena: ");
        texto1 = sc.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        texto2 = sc.nextLine();
        
        // Empezamos a crear el interior del programa
        // Comparaciones
        iguales = texto1.equals(texto2);
        igualesSinMayus = texto1.equalsIgnoreCase(texto2);

        // Mostramos el resultado
        System.out.println("\n¿Son exactamente iguales?: " + iguales);
        System.out.println("¿Son iguales sin distinguir mayúsculas?: " + igualesSinMayus);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘