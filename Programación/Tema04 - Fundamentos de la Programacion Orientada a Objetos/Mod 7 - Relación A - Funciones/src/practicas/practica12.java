
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 13:45:56
 *
 *  Nombre del programa : practica12
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El 
programa debe tener una función que reciba como parámetro una cantidad en 
kilómetros y nos la devuelva en millas.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica12 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int km;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el número de kilómetros: ");
        km = sc.nextInt();
        
        // Mostramos el resultado
        System.out.printf("%d kilometros son %d millas\n", km, kilometros_a_millas(km));

    } //main()
    
    public static int kilometros_a_millas ( int km ){
        
        // Devuelvo el resultado
        return (int) (km / 1.60934);        
        
    } // kilometros_a_millas(millas)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘