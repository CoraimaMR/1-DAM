
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 9 ene 2026     ⏰ Hora: 9:26:57
 *
 *  Nombre del programa : practica01
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
1. Escribe un programa que pida dos números reales por teclado y muestre por 
pantalla el resultado de multiplicarlos. Implementa y utiliza la función:

double multiplica(double a, double b) | Devuelve la multiplicación de dos números
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica01 {

    public static void main(String[] args) {

        // Declaración de variables
        double a,b;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        a = sc.nextInt();
        
        System.out.print("Introduce un número: ");
        b = sc.nextInt();

        // Mostramos el resultado
        System.out.println("El resultado es "+multiplica(a,b));

    } //main()

    public static double multiplica(double a, double b) {
        
        // Devuelvo el resultado
        return a*b;  
        
    } // multiplica

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘