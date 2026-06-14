
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 12 ene 2026     ⏰ Hora: 13:17:44
 *
 *  Nombre del programa : practica11
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Realiza un programa que escriba la tabla de multiplicar de un número introducido
por teclado. Para ello implementa una función que reciba como parámetro un número
entero y muestre por pantalla la tabla de multiplicar de dicho número.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica11 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int n;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("TABLA DEL ");
        n = sc.nextInt();

        practica11.tablaMultiplicar(n);
        
    } //main()
    
    public static void tablaMultiplicar ( int n ){
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        } // tabla()
        
    } // tablaMultiplicar(n)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘