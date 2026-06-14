
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 12:01:24
 *
 *  Nombre del programa : practica05
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Escribe un programa que pida un valor entero en millas y muestre su equivalente
en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y 
utiliza la función:
 
double millas_a_kilometros(int millas)
Devuelve la conversión de millas a kilómetros
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica05 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int millas;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        millas = sc.nextInt();
        
        // Mostramos el resultado
        System.out.printf("\n%d millas son %f kilómetros.\n", millas, millas_a_kilometros(millas));

    } //main()
    
    public static double millas_a_kilometros(int millas) {
       
        // Devuelvo el resultado
        return 1.60934 * millas;        
        
    } // millas_a_kilometros(millas)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘