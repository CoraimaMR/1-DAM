
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 nov 2025     ⏰ Hora: 22:09:07
 *
 *  Nombre del programa : PiramideMaya
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada.

Ejemplo 1:
Introduzca la altura de la pirámide maya: 5
    ******
   **    **
  **********
 ****    ****
**************

Ejemplo 2:
Introduzca la altura de la pirámide maya: 8
       ******
      **    **
     **********
    ****    ****
   **************
  ******    ******
 ******************
********    ********
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package otros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PiramideMaya {

    public static void main(String[] args) {

        // Declaración de variables
        int altura = 0;
        boolean seguir, pintarHueco = false;
        int ancho = 6, espacios;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {            
            seguir = false;
            try {
                System.out.print("Introduce la altura de la piramide maya (min 3): ");
                altura = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                seguir = true;
            }
        } while (seguir || altura<3);
        
        // Empezamos a crear el interior del programa
        espacios = altura - 1;  // Espacios antes de cada línea
        
        for (int fila = 0; fila < altura; fila++) {

            // Espacios izquierdos
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }

            // Si toca hueco
            if (pintarHueco && fila > 0) {
                int lado = (ancho - 4) / 2;  // Asteriscos a cada lado
                for (int i = 0; i < lado; i++) System.out.print("*");
                System.out.print("    ");     // hueco central
                for (int i = 0; i < lado; i++) System.out.print("*");
            } else {
                for (int i = 0; i < ancho; i++) System.out.print("*");
            }

            System.out.println();

            // Actualizamos valores para siguiente línea
            espacios--;
            ancho += 2;  // Cada nivel crece 4 caracteres
            pintarHueco = !pintarHueco;  // Cambiamos de formato
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘