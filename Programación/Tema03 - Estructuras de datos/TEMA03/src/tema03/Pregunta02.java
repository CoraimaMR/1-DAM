
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 ene 2026     ⏰ Hora: 9:04:22
 *
 *  Nombre del programa : Pregunta02
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package tema03;
import java.util.Scanner;

public class Pregunta02 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        String palabra;
        String masCorta = null;
        String ultimaAlfabeto = null;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine().trim(); // Escaneamos y quitamos el primer y ultimo espacio
        
        String[] palabras = frase.split("\\s+"); // Separo la frase en palabras
        
        // Empezamos a crear el interior del programa
        for (int i = 0; i < palabras.length; i++) {
            palabra = palabras[i]; // Tomamos la palabra actual
            if (i == 0) { // Metemos un valor predeterminado
                masCorta = palabra;
                ultimaAlfabeto = palabra;
            }
            if (palabra.length() < masCorta.length()) { // Si la palabra es mas corta que la anterior se renueva
                masCorta = palabra;
            }
            if (palabra.compareToIgnoreCase(ultimaAlfabeto) > 0) { //  // compareToIgnoreCase devuelve > 0 si 'palabra' va después que 'ultimaAlfabetica'
                ultimaAlfabeto = palabra;
            }
        }

        // Mostramos el resultado
        System.out.println("\nLa útima palabra en orden alfabético es: " + ultimaAlfabeto);
        System.out.println("La palabra más corta es: " + masCorta);

    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘