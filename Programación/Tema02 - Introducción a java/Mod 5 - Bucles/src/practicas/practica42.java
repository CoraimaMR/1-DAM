
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 14 nov 2025     ⏰ Hora: 20:13:36
 *
 *  Nombre del programa : practica42
 *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Ejercicio 42
Un número es divisible por 11 si la diferencia entre la suma de sus dígitos pares y la suma de sus 
dígitos impares es cero o múltiplo de 11. Diseña un programa que indique si un número entero
positivo introducido por teclado es o no divisible por 11 aplicando el criterio anterior.
*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica42 {
    public static void main(String[] args) {

        // Declaración de variables
        double n = 0, copia;
        int digito = 0, sumapar = 0, sumaimpar = 0;
        boolean repetir;
        
         // Lectura y comprobación de datos introducidos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {
            repetir = false;
            try {
                System.out.print("Por favor, introduzca un número entero positivo: ");
                n = sc.nextLong();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                
                sc.nextLine();
                repetir = true;
            }
        } while (repetir || n <= 0);
        
        // Empezamos a crear el interior del programa
        copia=n;
        
        if (n % 11 == 0) {
            System.out.println("Es divisible por 11");
            
            }else{
            
            while (copia>0) {
            digito = (int) copia % 10;
            
            if (digito % 2 == 0) {
                sumapar += digito;
            } else {
                sumaimpar += digito;
            }
            
            copia /= 10;
        }
            
        // Mostramos el resultado
        if (sumapar - sumaimpar == 0) {
            System.out.println("Es divisible por 11");
        } else {
            System.out.println("No es divisible por 11");
        }
        }
        
        
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘