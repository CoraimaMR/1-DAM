
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 18 nov 2025     ⏰ Hora: 10:12:47
 *
 *  Nombre del programa : practica12
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Crea un programa que cree un array de 10 enteros y luego muestre el siguiente 
menú con distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.

La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un 
valor V y una posición P, luego escribirá V en la posición P del array. El menú 
se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que 
terminará el programa.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package Avectores;
import java.util.Scanner;

public class practica12Menu {

    public static void main(String[] args) {

        // Declaración de variables
        int [] vector;
        int respuesta;
        boolean fin = true;
        int v = 0, p = 0;
        
        vector = new int[10]; // tamaño array
        
        Scanner sc = new Scanner(System.in);
        
        // Empezamos a crear el interior del programa
        do {  
            // Lectura y comprobación de datos introducidos por teclado
            System.out.println("********** MENU **********");
            System.out.println("Elige una opción:");
            System.out.println("1. Mostrar valores.");
            System.out.println("2. Introducir valor.");
            System.out.println("3. Salir.");
            System.out.println("**************************");

            
            System.out.print("Introduce el número asignado a tu opción (1-3): ");
            respuesta = sc.nextInt();
            
            System.out.println("");
            switch (respuesta) {
                case 1: // Mostramos los números guardados
                    System.out.println("Valores del vector en las posiciones del"
                            + " 1 al 10: ");
                    for (int i = 0; i < vector.length; i++) {
                        System.out.print(vector[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 2: // Cambiar un número en una posición determinada
                    System.out.print("Introduce un valor para introducir:");
                    v = sc.nextInt();
                    
                    System.out.print("Introduce la posición a poner:");
                    p = sc.nextInt();
                    
                    for (int i = 0; i < vector.length; i++) {
                        if (i+1 == p) vector[i] = v;
                    }
                    break;
                case 3: // Terinar programa
                    System.out.println("Saliendo del programa.");
                    fin = false;
                    break;
                default: System.out.println("ERROR. Solo se puede introducir "
                        + "números enteros (1-3).");
            }
            System.out.println("");
        } while (fin);

        // Mostramos el resultado
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘