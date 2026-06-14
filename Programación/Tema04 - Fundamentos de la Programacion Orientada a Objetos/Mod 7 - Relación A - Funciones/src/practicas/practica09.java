
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 12:59:10
 *
 *  Nombre del programa : practica09
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que pida introducir tres valores enteros y nos diga cuál de 
ellos es el más elevado. Impleméntalo creando únicamente una función a la que le
pasemos dos valores (notres) y nos devuelva el máximo de los dos valores.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica09 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int valor1, valor2, valor3;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el valor 1: ");
        valor1 = sc.nextInt();
        
        System.out.print("Introduzca el valor 2: ");
        valor2 = sc.nextInt();
        
        System.out.print("Introduzca el valor 3: ");
        valor3 = sc.nextInt();
        
        // Mostramos el resultado
        System.out.println("El número más elevado es "+maximo (valor1, valor2, valor3));

    } //main()
    
    public static int maximo (int valor1, int valor2, int valor3){
        
        // Devuelvo el resultado
        return Math.max(valor1, Math.max(valor2, valor3));        
        
    } // maximo (valor1, valor2, valor3)
        
    } //  clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘