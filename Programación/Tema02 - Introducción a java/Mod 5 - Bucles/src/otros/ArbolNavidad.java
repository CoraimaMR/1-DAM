
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 nov 2025     ⏰ Hora: 22:02:22
 *
 *  Nombre del programa : ArbolNavidad
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4.

Ejemplo 1:
Por favor, introduzca la altura del árbol: 7
    *
    ^
   ^ ^
  ^   ^
 ^     ^
^^^^^^^^^
    Y

Ejemplo 2:
Por favor, introduzca la altura del árbol: 4
 *
 ^
^^^
 Y

Ejemplo 3:
Por favor, introduzca la altura del árbol: 10
       * 
       ^
      ^ ^
     ^   ^
    ^     ^
   ^       ^
  ^         ^
 ^           ^
^^^^^^^^^^^^^^^
       Y
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package otros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArbolNavidad {

    public static void main(String[] args) {

        // Declaración de variables
        int altura = 0;
        boolean repetir;
        int espacioAntes, espacioDentro = 1, ultimaLinea = 3;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
                
        do {            
            repetir = false;
            try {
                System.out.print("Introduce la altura del arbol (mayor o igual a 4): ");
                altura = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                repetir = true;
            }
        } while (repetir || altura<4);
        
        // Empezamos a crear el interior del programa
        espacioAntes = altura-4;
       
        // ESTRELLA
        for (int i = 0; i < altura-3; i++) {
            System.out.print(" ");  // estrella
        }
        System.out.println("*");  // Siguiente linea
        
        // ARBOL
        // Primera linea
        for (int i = 0; i < altura-3; i++) {
            System.out.print(" ");
        }
        System.out.println("^");  // Siguiente linea
        
        // Lineas Intermedias
        for (int i = 0; i < altura-4; i++) {  // Numero de lineas
            for (int j = 0; j < espacioAntes; j++) {  // Espacio en blanco fuera
                System.out.print(" ");
            }
            System.out.print("^");  // Caracter izquierda
            for (int j = 0; j < espacioDentro; j++) {  // Espacio en blanco dentro
                System.out.print(" ");
            }
            System.out.print("^");  // Caracter derecha
            System.out.println("");  // Siguiente linea
            espacioAntes--;  // Vamos quitando de uno en uno
            espacioDentro+=2;  // Sumamos en dos en dos
            ultimaLinea+=2;  // Contador para la base del arbol
        }
        
        // Ultima linea
        for (int i = 0; i < ultimaLinea; i++) {
            System.out.print("^");
        }
        System.out.println("");  // Siguiente linea
        
        // TRONCO ARBOL
        for (int i = 0; i < altura-3; i++) {
            System.out.print(" ");  // tronco
        }
        System.out.println("Y");  // Siguiente linea
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘