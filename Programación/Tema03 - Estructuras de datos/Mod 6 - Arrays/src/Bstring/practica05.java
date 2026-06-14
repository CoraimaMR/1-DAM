
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 1 dic 2025     ⏰ Hora: 19:00:36
 *
 *  Nombre del programa : practica05
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que lea una frase por teclado e indique si la frase es un 
palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y 
minúsculas). Supondremos que el usuario solo introducirá letras y espacios 
(ni comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se lee 
igual de izquierda a derecha que de derecha a izquierda. Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Bstring;
import java.util.Scanner;

public class practica05 {

    public static void main(String[] args) {
        // Declaración de variables
        String texto, limpio, invertido = null;
        
       // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        texto = sc.nextLine();

        // Quitar espacios y pasar a minúsculas
        limpio = texto.replace(" ", "").toLowerCase();

        // Invertir la cadena
        for (int i = limpio.length() - 1; i >= 0; i--) {
            invertido += limpio.charAt(i);
        }

        // Comprobar si es palíndromo
        if (limpio.equals(invertido)) {
            System.out.println("La frase SÍ es un palíndromo.");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘