
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 17:58:07
 *
 *  Nombre del programa : practica08
 *
 *******************************************************/

/* 8. Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y
luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.  */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica08 {
    public static void main(String[] args) {

        // Declaración de variables
        int n, positivo=0, negativo=0;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Introduce un número (0 para finalizar):");
            n= sc.nextInt();
            
            if (n<0) {
                negativo++;
            } else {
                if (n>0) {
                    positivo++;
                }
            }
            } while (n!=0);
        
        //Solucción
        System.out.println("Números positivos: "+positivo);
        System.out.println("Números negativos: "+negativo);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘