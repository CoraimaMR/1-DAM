
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 4 dic 2025     ⏰ Hora: 12:53:32
 *
 *  Nombre del programa : practica05
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que lea por teclado una cadena de caracteres e indique la 
cantidad de palabras que tiene. De la clase String, sólo se pueden utilizar los 
métodos length(), charAt() y trim().
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Drepaso;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        
        // Declaración de variables
        String frase;
        int palabras = 0;
        String alfabeto = "qwertyuiopñlkjhgfdsazxcvbnm";

        // Lectura de datos
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine().trim();   // quitamos espacios al inicio y final

        // Si la frase no queda vacía tras trim(), entonces tiene al menos 1 palabra
        if (frase.length() > 0) {
            palabras = 1;
            
            frase = frase.toLowerCase();  // Convertimos toda a minuscula
            
            // Recorremos la cadena buscando transiciones espacio -> letra
            for (int i = 0; i < frase.length() - 1; i++) {
                // Si encontramos espacio y luego una letra, es una nueva palabra
                if (frase.charAt(i) == ' ' && (alfabeto.indexOf(frase.charAt(i + 1))) > 0) {
                    palabras++;
                }
            }
        }

        // Mostramos el resultado
        System.out.println("Número de palabras: " + palabras);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘