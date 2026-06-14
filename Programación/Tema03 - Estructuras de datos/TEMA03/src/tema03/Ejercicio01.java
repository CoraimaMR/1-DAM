
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 11 dic 2025     ⏰ Hora: 11:52:01
 *
 *  Nombre del programa : Ejercicio01
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package tema03;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        // Declaración de variables y constantes
        String frase;
        String alfabeto="abcdefghijklmnñopqrstuvwxyz";
        boolean pangrama = true; 
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una frase para verificar si es un pangrama: ");
        frase=sc.nextLine();
        
        // Empezamos a crear el interior del programa
        for (int i = 0; i < alfabeto.length(); i++) {
            if (frase.indexOf(alfabeto.charAt(i)) == -1) {
                pangrama = false;
            }
        }
        
        // Mostramos el resultado
        if (pangrama) {
            System.out.println("La frase es un pangrama.");
        } else {
            System.out.println("La frase no es un pangrama.");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘