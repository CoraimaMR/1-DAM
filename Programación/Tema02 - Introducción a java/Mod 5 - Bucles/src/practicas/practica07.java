
/*******************************************************
 * 
 *               💻  PROGRAMACIÓN EN JAVA  💻
 *
 *  Autora:      🌟 Coraima Mera Rodríguez 🌟
 *  Curso:         Programación de 1º  DAM
 *
 *         🗓️ Fecha: 7 nov 2025     ⏰ Hora: 17:57:41
 *
 *  Nombre del programa : practica07
 *
 *******************************************************/

/* 7. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando
cuántos son positivos y cuantos negativos.   */

// ┌────────────────────────────────────┐
// │ 🔹🔹🔹 INICIO DEL PROGRAMA 🔹🔹🔹 │
// └────────────────────────────────────┘

package practicas;
import java.util.Scanner;

public class practica07 {
    public static void main(String[] args) {

        // Declaración de variables
        int n, i=0, positivo=0, negativo=0;
        
        // Lectura de datos por teclado
        Scanner sc = new Scanner(System.in);
        
        do {
            do {                
                System.out.println("Introduce un número (0 no cuentan):");
                 n= sc.nextInt();
                 if (n==0) {
                     System.out.println("ERROR. No se puede introducir un 0.");
                }
            } while (n==0);
            i++;
            if (n<0) {
                negativo++;
            } else {
                positivo++;
            }
        } while (i<10);
        
        //Solucción 
        System.out.println("Números positivos: "+positivo);
        System.out.println("Números negativos: "+negativo);
    }
}

// ┌────────────────────────────────────┐
// │  🔸🔸🔸 FIN DEL PROGRAMA 🔸🔸🔸   │
// └────────────────────────────────────┘