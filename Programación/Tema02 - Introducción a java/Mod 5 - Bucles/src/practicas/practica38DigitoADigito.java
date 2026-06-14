
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 14 nov 2025     ⏰ Hora: 17:56:33
 *
 *  Nombre del programa : practica38
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Ejercicio 38
Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9. Los números de la 
mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un número es afortunado si contiene más 
números de la suerte que de la mala suerte. Realiza un programa que diga si un número introducido 
por el usuario  es afortunado o no.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica38DigitoADigito {
    public static void main(String[] args) {

        // Declaración de variables
        int n = 0, copia, digito=0;
        int longitud = 0, buenasuerte = 0, malasuerte = 0;
        boolean repetir;
        
         // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {
            repetir = false;
            try {
                System.out.print("Por favor, introduzca un número positivo: ");
                n = (int) sc.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                repetir = true;
            }
        } while (repetir || n < 0);
        
        // Empezamos a crear el interior del programa
        copia=n;
        
        // Averiguamos la longitud del número
        while (copia > 0) {
            copia /= 10;
            longitud++;
        }
        // Probamos número por número
        for (int i = 1; i <= longitud; i++) {
            digito = (int) ((n / Math.pow(10, longitud - i)) % 10);
            System.out.println("Dígito " + i + ": " + digito);
            
            // Depende del número es suerte o no
            switch (digito) {
                case 3, 7, 8, 9 -> buenasuerte++;
                case 0, 1, 2,4,5,6 -> malasuerte++;
            }
        }
        
        // Mostramos el resultado
        if (buenasuerte>malasuerte) {
            System.out.println("El número "+n+" es un número de buena suerte.");
        } else {
             System.out.println("El número "+n+" es un número de mala suerte.");
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘