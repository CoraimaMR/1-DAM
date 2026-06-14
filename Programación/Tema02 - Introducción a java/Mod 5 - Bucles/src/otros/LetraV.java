
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 23 nov 2025     ⏰ Hora: 22:05:44
 *
 *  Nombre del programa : LetraV
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.

Ejemplo 1:
Introduzca la altura de la V (un número mayor o igual a 3): 7
***            ***
 ***          ***
  ***        ***
   ***      ***
    ***    ***
     ***  ***
      ******

Ejemplo 2:
Introduzca la altura de la V (un número mayor o igual a 3): 4
***      ***
 ***    ***
  ***  ***
   ******

Ejemplo 3:
Introduzca la altura de la V (un número mayor o igual a 3): 2
La altura debe ser mayor o igual a 3.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package otros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LetraV {

    public static void main(String[] args) {

        // Declaración de variables
        int altura = 0;
        boolean seguir;
        int espacioIzq = 0, espacioAdentro;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {            
            seguir = false;
            try {
                System.out.print("Introduce la altura de la V (min 3): ");
                altura = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                seguir = true;
            }
        } while (seguir || altura<3);
        
        // Empezamos a crear el interior del programa
        espacioAdentro = (altura-1)*2;
        
        for (int i = 0; i < altura-1; i++) {  // Numero de linea
            for (int j = 0; j < espacioIzq; j++) {  // Espacio en blanco izquierda
                System.out.print(" ");
            }
            
            System.out.print("***");
            for (int j = 0; j < espacioAdentro; j++) {  // Espacio en blanco adentro
                System.out.print(" ");
            }
            System.out.print("***");
            espacioIzq++;
            espacioAdentro-=2;
            System.out.println("");  // Siguiente linea
        }
        
        // Ultima linea
        for (int i = 0; i < espacioIzq; i++) {  // Espacioo en blanco izquierda
            System.out.print(" ");
        }
        System.out.print("******");  
        System.out.println("");  // Siguiente linea
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘