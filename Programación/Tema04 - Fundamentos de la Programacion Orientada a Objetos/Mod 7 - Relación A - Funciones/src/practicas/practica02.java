
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 9 ene 2026     ⏰ Hora: 9:54:17
 *
 *  Nombre del programa : practica02
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
2. Escribe un programa que pida la edad por teclado y muestre por pantalla si 
eres mayor de edad o no. Implementa y utiliza la función:

boolean esMayorEdad(int a) | Devuelve verdadero si a>=18, falso en caso contrario
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica02 {

    public static void main(String[] args) {

        // Declaración de variables
        int edad; 
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        edad = sc.nextInt();
        
        // Mostramos el resultado
        if (esMayorEdad(edad)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

    } //main()
    
    public static boolean esMayorEdad(int edad) {
        
//        // Declaración de variables
//        boolean esMayorEdad = false;
//        
//        // Interior del programa
//        if (edad >= 18) esMayorEdad = true;
//
//        // Devuelvo el resultado
//        return esMayorEdad;     

          return edad >= 18;
        
    } // adulto(edad)
    
} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘