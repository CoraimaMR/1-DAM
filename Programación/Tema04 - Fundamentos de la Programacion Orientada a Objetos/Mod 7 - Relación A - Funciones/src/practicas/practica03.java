
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 9 ene 2026     ⏰ Hora: 10:05:25
 *
 *  Nombre del programa : practica03
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
3. Escribe un programa que pida dos números enteros por teclado y muestre por 
pantalla cual es el mínimo. Implementa y utiliza la función:

int minimo(int a, int b) | Devuelve el menor entre a y b
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica03 {

    public static void main(String[] args) {

        // Declaración de variables
        int a,b;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        a = sc.nextInt();
        
        System.out.print("Introduzca un número: ");
        b = sc.nextInt();

        // Mostramos el resultado
        System.out.printf("\nEl minimo entre %d y %d es %d\n",a,b,minimo(a,b));

    } //main()
    
    public static int minimo(int a, int b) {
        
//        // Declaración de variables
//        int minimo;
//        
//        // Empezamos a crear el interior del programa
//        if (a<b) {
//            minimo  = a;
//        } else {
//            minimo = b;
//        }
//        
//        // Devuelvo el resultado
//        return minimo;  
        
        return Math.min(a, b);
        
    } // minimo(a,b)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘