
/*******************************************************
 *                                                     *
 *             💻  PROGRAMACIÓN EN JAVA  💻             *
 *                                                     *
 *  Autora:    🌟 Coraima Mera Rodríguez 🌟             *
 *  Curso:       Programación de 1º  DAM               *
 *                                                     *
 *     🗓️ Fecha: 12 nov 2025     ⏰ Hora: 12:00:39      *
 *                                                     *
 *  Nombre del programa : practica37                   *
 *                                                     *
 *******************************************************/

/********************************* ENUNCIADO ***********************************
Ejercicio 37
Escribe un programa que sea capaz de insertar un dígito dentro de un número 
indicando la posición. El nuevo dígito se colocará en la posición indicada y 
el resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan 
de izquierda a derecha empezando por el 1. Se recomienda usar long en lugar de 
int ya que el primero admite números más largos. Se debe garantizar la correcta 
introducción de los datos.

Ejemplo:
Por favor, introduzca un número entero positivo: 406783
Introduzca la posición donde quiere insertar: 3
Introduzca el dígito que quiere insertar: 5
El número resultante es 4056783.

*******************************************************************************/

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica37Sandwich {

    public static void main(String[] args) {

        // Declaración de variables
        long n = 0, copia, guardado1 = 0, guardado2 = 0;
        long resultado = 0, divisor = 1;;
        int posicion = 0, digito = 0, longitud = 0;
        boolean repetir;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        //NUMERO
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
        } while (repetir||n<=0);
        
        //POSICIÓN
        do {
            repetir = false;
            try {
                System.out.print("Introduzca la posición donde quiere insertar: ");
                posicion = sc.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
        } while (repetir||posicion<=0);
        
        //DIGITO A REPETIR
        do {
            repetir = false;
            try {
                System.out.print("Introduzca el dígito que quiere insertar: ");
                digito = sc.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, tipo de excepción " + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
        } while (repetir||digito<=0);
        
        // 1. Contar dígitos
        copia = n;
        while (copia > 0) {
            copia /= 10;
            longitud++;
        }

        if (posicion > longitud + 1) {
            System.out.println("La posición indicada es demasiado grande.");
        } else {
          
         // 2. Calcular divisor = 10^(longitud - posicion + 1)
         for (int i = 1; i <= longitud - posicion + 1; i++) {
               divisor *= 10;
          }

            // 3. Separar izquierda y derecha
            guardado1 = n / divisor;   // parte izquierda
            guardado2 = n % divisor;   // parte derecha

            // 4. Construir resultado
            resultado = guardado1 * (divisor * 10) + digito * divisor + guardado2;

            System.out.println("El número resultante es " + resultado);
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘