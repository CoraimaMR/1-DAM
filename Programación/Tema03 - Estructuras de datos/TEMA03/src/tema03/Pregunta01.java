
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 ene 2026     ⏰ Hora: 9:04:14
 *
 *  Nombre del programa : Pregunta01
 *
 *******************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package tema03;

public class Pregunta01 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        final int FILAS = 10;
        final int COLUMNAS = 10;
        int n, contadorArray = 0, max = 200, min = 300;
        int[] diagonales = new int[FILAS]; // Creacion de array de 1 dimension
        
        
        // Empezamos a crear el array
        for (int i = 0; i < FILAS; i++) { // FILAS
            for (int j = 0; j < COLUMNAS; j++) { // COLUMNAS
                n = (int)((Math.random() * 101) +200); // Calculamos el número aleatorio
                System.out.print(n + "   "); // Mostramos el número aleatorio
                
                // Condición: Primera mitad de la diagonal principal OR Segunda mitad de la diagonal secundaria
                if ((i < FILAS / 2 && i == j) || (i >= FILAS / 2 && i + j == FILAS - 1)) {
                    diagonales[contadorArray] = n;
                    contadorArray++;
                    
                    // Cálculo de máximo y mínimo de esas diagonales
                    if (n > max) max = n;
                    if (n < min) min = n;
                }

            }
            System.out.println();  // Salto de linea
        }
        
        // Mostramos el resultado
        System.out.println("\nMEDIAS DIAGONALES");
        for (int i = 0; i < diagonales.length; i++) { // Mostramos las diagonales
            System.out.print(diagonales[i] + "  ");
        }
        
        System.out.println("\n\nMaximo: " + max);
        System.out.println("Minimo: " + min);

    } //main()

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘