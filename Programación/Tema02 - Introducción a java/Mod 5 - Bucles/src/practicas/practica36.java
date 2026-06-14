
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 11 nov 2025     ⏰ Hora: 9:30:34
 *
 *  Nombre del programa : practica36
 *
 *******************************************************/

/* Ejercicio 35 
Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay 
dentro de un número.Ejercicio 36 
Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir 
la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, 
en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
*       *
  *   *
    *
  *   *
*       *  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica36 {

    public static void main(String[] args) {

        // Declaración de variables
        int altura, blanco1=0, blanco2;
        
        // Lectura y comprobación de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Por favor, introduzca la altura de la X:");
            altura = sc.nextInt();
            //Mensaje de ERROR
            if (altura < 3 || altura%2 == 0) {
                System.out.println("ERROR. La altura debe ser impar y mayor o igual a 3.");
            }
        } while (altura < 3 || altura%2 == 0);
        
        // Empezamos a crear el interior del programa
        blanco2=altura-2;
        
        //PRIMERA PARTE
        for (int i = 1; i <= (altura-1)/2; i++) {
            
            //Espacio en blanco afuera
            for (int j = 1; j <= blanco1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            //Espacio en blanco adentro
            for (int k = 1; k <= blanco2; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
            
            blanco1++;
            blanco2=blanco2-2;
        }
        
        //SEGUNDA PARTE
        for (int i = 1; i <= blanco1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        
        //TERCERA PARTE
         blanco1--;
         blanco2=1;
         
        for (int i = 1; i <= (altura-1)/2; i++) {
            
            //Espacio en blanco afuera
            for (int j = 1; j <= blanco1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            
            //Espacio en blanco adentro
            for (int k = 1; k <= blanco2; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
            
            blanco1--;
            blanco2=blanco2+2;
        }
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘