
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 1 dic 2025     ⏰ Hora: 18:54:25
 *
 *  Nombre del programa : practica04
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay 
(cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se 
debe diferenciar entre mayúsculas y minúsculas. Por ejemplo dada la frase “Mi 
mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Bstring;
import java.util.Scanner;

public class practica04 {

    public static void main(String[] args) {

        // Declaración de variables
        String frase;
        int contadorA, contadorE, contadorI, contadorO, contadorU;
        
        // Inicialización de contadores
        contadorA = 0;
        contadorE = 0;
        contadorI = 0;
        contadorO = 0;
        contadorU = 0;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        
        // Empezamos a crear el interior del programa
        
        // Convertimos a minúsculas para no distinguir entre mayúsculas y minúsculas
        frase = frase.toLowerCase();

        // Recorrer cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == 'a') {
                contadorA++;
            } else if (c == 'e') {
                contadorE++;
            } else if (c == 'i') {
                contadorI++;
            } else if (c == 'o') {
                contadorO++;
            } else if (c == 'u') {
                contadorU++;
            }
        }

        // Mostramos el resultado
        System.out.println("\nNº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘