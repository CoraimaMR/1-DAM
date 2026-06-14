
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 14 nov 2025     ⏰ Hora: 17:59:11
 *
 *  Nombre del programa : practica41
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Ejercicio 41
Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7
Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica41 {
    public static void main(String[] args) {

        // Declaración de variables
        double n = 0, copia;
        int longitud = 0, digito = 0, posicionAleatoria = 0;
        boolean repetir;
        
         // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {
            repetir = false;
            try {
                System.out.print("Por favor, introduzca un número positivo: ");
                n = sc.nextLong();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                repetir = true;
            }
        } while (repetir || n < 0);
        
        // Empezamos a crear el interior del programa
        copia=n;
        
        while (copia>0) {
            copia/=10;
            longitud++;
        }
        
        // Elegimos una posición al azar (entre 1 y longitud)
        posicionAleatoria = (int)(Math.random() * longitud) + 1;

        // Obtenemos el dígito de esa posición
        digito = (int)((n / Math.pow(10, longitud - posicionAleatoria)) % 10);      
        
        // Mostramos el dígito elegido
        System.out.println(digito);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘