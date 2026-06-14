
/*******************************************************
 *
 *             💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟
 *  Curso:       Programación de 1º  DAM
 *
 *     🗓️ Fecha: 13 ene 2026     ⏰ Hora: 8:23:17
 *
 *  Nombre del programa : practica14
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
 Escribe una función que muestre por pantalla un triángulo como el del ejemplo. 
 Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de
 líneas del triángulo.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica14 {

    public static void main(String[] args) {

        // Declaración de variables y constantes
        int numLineas;
        char caracter;
        
        // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el caracter a imprimer: ");
        caracter = sc.next().charAt(0);
        
        System.out.print("Introduzca el número de lineas: ");
        numLineas = sc.nextInt();
        
        // Mostramos el resultado
        practica14.piramide(caracter, numLineas);

    } //main()
    
    public static void piramide (char caracter, int numLineas){
        
        // Declaración de variables
        int contadorCaracter = 0;
        
        // Empezamos a crear el interior del programa
        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= numLineas-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1+contadorCaracter; j++) {
                System.out.print(caracter);
            }
            System.out.println();  // Salto de linea
            contadorCaracter += 2;
        }
        
    } // piramide (caracter, numLineas)

} // clase principal

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘